package Conversiones;

public class Ambito {
	int q; //Variable a nivel de clase
	void marcas(){
		int a ; //Local o marca
		a = 124;
		q = 1;
		{ //Primer nivel de marcas
			int b; //Variable local
			b =  124;
			a = 457;
			q = 2;
			{ //Subnivel mas interno de marca
				int c;
				c = 124;
				b = 457;
				a = 788;
				q = 3;
			}
		}
		//b = 1; Provoca error porque solo es visible en el bloque 
	}
}