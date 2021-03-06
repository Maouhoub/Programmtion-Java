package ma.jeunavale;

/**
 * classe Grille : permet de représenter la grille de chaque joueur
 * @author MUSTAPHA
 *
 */
public class Grille 
{  
	
	/**
    *Champ privé de type Case[][] : matrice de dimention 10*10 représente 100 objet Case d'un joueur
    */
	private Case[][] grille = new Case[10][10];
	
	/**
	 * Constructeur par défaut : tous les element de grille sont instancié par 
	 * le constructeur par défaut de Case .
	 */
	public Grille()
	{
		for(int i = 0; i < 10; ++i)
		{
			for(int j = 0; j < 10; ++j)
			{
				this.grille[i][j] = new Case();
			}
		}
	}
	
	/**
	 * permet de tirer (changer l'état) d'une case déterminée par ses coordonées
	 * @param x : type int, abscisse de la Case objectif.
	 * @param y : type int, ordonnée de la Case objectif.
	 */
	public void tir(int x, int y)
	{
		if(this.grille[x][y].getEtat() == false)
			this.grille[x][y].setEtat(true);
	}
	
	/**
	 * permet d'afficher la grille de l'adversaire, à l'état actuel.
	 */
	public void afficheTirs()
	{
		for(Case[] x : this.grille)
		{
			for(Case y : x)
			{
				if(y.getEtat())
					System.out.print("o ");
				else
					System.out.print("x ");
			}
			System.out.println();
		}
	}
	
	/**
	 * permet de récupérer la grille du joueur actuel
	 * @return : type : Case[][] tableu à deux dimenstion représentant la grille .
	 */
	public Case[][] getGrille() {
		return grille;
	}
	public void setGrille(Case[][] grille) {
		this.grille = grille;
	}
	

}
