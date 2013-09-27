import java.io.*;

public class ImagePGM {

	int abs;
	int ord;
	int niveauGris = 255;
	
	public static void Reecrire()
	{
		InputStream ips;
		try {
			ips = new FileInputStream("lena.pgm");
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			String ligne;
			while ((ligne=br.readLine())!=null)
			{
				// stocker la ligne et les infos sur le pixel
				// Créer nouveau fichier
				//Ecrire(nouveauFichier, ligneStockée)
			}
			br.close();
			}
		
		catch (IOException e)
		{
		}
			
			
	}
	
	public static void Ecrire(File file, String contenu)
	{
		//Ecrit le contenu dans une nouvelle ligne à la suite du contenu 
		//déjà existant dans le fichier spécifié
	}
	
	public static int[] Histogramme()
	{
		return new int[] {0,1};
	}
}
