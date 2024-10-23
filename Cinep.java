import java.util.Scanner;

public class Cinep {
	Scanner sc= new Scanner(System.in);
	private String pelicula, Car1,dulceria,cine1, ciudad,evento,capacidad;
	private double  total,igv, subtotal, vuelto, pago, resto,costo2d=10,costo3d=18, costoniños2d=8,costoviejos=8,costoniños3d=15,costoviejos3d=15,costopromo2d=8,costopromo3d=12,costosocio2d =6,costosocio3d = 12;
	private int opcion, tiempo, pelicula1,cine,preciodulceria,comboscoorporativo,cantidad=0,dia,mes ,año;


	//IOSEF
	public void menuprincipal(){
		System.out.println("""

                                       ;coxO000kxolc;
                                       :oOXWWXOdlc;
                                     :kXWWXkl;
                                   ;xNMWXx:
                                  c0WMWO:                          :oc                       :ooc                                        okxc                                     :dkd:
                                 cKMMNx;                         ;dXW0cll                    :ooc                                        okxc                                     :dkd:
                                :OWMWk;     ;:ll:            :oOKOk0KOOKO:                                                              :0MWx                                     oNMXl
                                dNMMKc    o0XNWWKl      ;:: lKWMW0ccONNk:          :dkOOkxc  ckOd; ;oxkkkkxxl;    :dkOOko:  :dk00KK0kl  :0MWx   :dkckxxkx: :dkkkkkxl;    cdkOOko;  oXMW0kcc
                                kWMWk     xWMMMWXd   ldOKNXxcdOkl; ;dOo;          oKWWXKXKd  dWMKc dNMWKKNWWW0c  oXWN0OXWKl oNMWKO0NMNx;:0MWx   ddcxkxkxx:xWMWKKNWW0c ;xNWN00NW0c oXMWKOll
                               ;OMMWx     ;dOOOOOkd:cKMMMWXk:                    cKMWOc;;;   dWMKc dNMKc lxKMWk cKMWK  0WMk;oNMNd ;xWMKc:0MWk        WWWO:xWMKc lKMWx;oXMWK  KWWx oXMXl
                                kWMWx;:ccc; dKNWMMW0clOOkkkkko    ;od:           lXMWx       dWMKc dWM0: :lOMMO;lXMWX0000Ol oNMNo  xWMXl:0MWk;oKWN0SKWMXo;xWMKc :OMWO:dNMWX0000kc oXMKl
                       ;dko    c0WMWKOXNWW0clKWWNXKOl  o0NWMW0c :xKWNd           ;OWMXkxxko  dWMKc dWM0: :lOMMO;:0WWK     ; oNMWKkONMNx;:0MWk:xWMK   NMXo;kWMKc :OMWO;cKMWK       oXMKl
                        :kOl   :kXWMXkOKKKOl :dO000KKOloKNKkd:  lKN0o;            :xKNNNNXx; c0NO: oXNO: ;ckNNk; ckKXNNNXk: oNMWNXXKOo; ;dXXd;ckKXXXNNXkc;xXNO: ;kNNx; lkKNNNNKx; cON0c
                        ;oO0kkOkdkNMW0loO000kcc0WMMMWXx;;:;      ::                 ;:cc:;    ;:;  ;:c:    :cc;    ;:ccc:   oNMNd;;;      ::;   ;:clcc;   ;cc:   :cc;    ;cccc;    ;c:
                     ;:cloxkxxk00xx0WW0dkXXXXx:cxO0000Oxc                                                                   lKWXo
                   :coddxxxdl::dO0kx0WWKdc::;;   oKNWMWNk;     ;;                                                            coo:
                ;:loxxxxdol:;   :colldk0X0d:     ;okkxol:   ;;;
                codxxxddoc:;           ;lxOOkdlc;;   ;;::::;;
                oddddoolc:;;            :clooollccccc::;
                oooolllcc
                olllccc
                \n
                """);
		System.out.print("                   			1.Peliculas	");
		System.out.print("	2.Cines    ");
		System.out.print("	3.Promociones    ");
		System.out.print("	4.Socio    ");
		System.out.print("	5:Dulceria    ");
		System.out.print("	6.Coorportivo    ");
		System.out.print("	7.Contactanos    ");
		System.out.println("");
		System.out.println("\n");
		System.out.print("""
                                        |-----------------------|                     |-----------------------|                      	|-----------------------|
                                        |      El Plan del      |                     |    	  Hellboy(9)      |                      	|      La Chica del     |
                                        |     	Asesino(8)	    |                     |                       |                     	|      Alquiler(10)     |
                                        |                       |                     |Lorem ipsum            |                   	  	|          			    |
                                        |Lorem ipsum            |                     |Lorem ipsum            |		                    |Lorem ipsum            |
                                        |Lorem ipsum            |                     |Lorem ipsum            |                         |Lorem ipsum            |
                                        |Lorem ipsum            |                     |Lorem ipsum            |                	        |Lorem ipsum            |
                                        |Lorem ipsum            |                     |                       |                 	    |Lorem ipsum            |
                                        |                       |                     |                       |                 	    |                       |
                                        |-----------------------|                     |-----------------------|                	       	|-----------------------|
                """);
		System.out.println("");
		System.out.print("""
                                        |-----------------------|                     |-----------------------|						  	|-----------------------|
                                        |  My Hero Academy(11)  |                     |    	 Guason 2(12)     |						  	|    La Sustancia(13)   |
                                        |                       |                     |                       |							|                       |
                                        |Lorem ipsum            |                     |Lorem ipsum            |							|Lorem ipsum            |
                                        |Lorem ipsum            |                     |Lorem ipsum            |							|Lorem ipsum            |
                                        |Lorem ipsum            |                     |Lorem ipsum            |							|Lorem ipsum            |
                                        |Lorem ipsum            |                     |Lorem ipsum            |							|Lorem ipsum            |
                                        |                       |                     |                       |							|                       |
                                        |                       |                     |                       |							|                       |
                                        |-----------------------|                     |-----------------------|							|-----------------------|
                """);
		System.out.println("\nEliga una opcion por favor:");
		opcion = sc.nextInt();
		switch (opcion){
			case 1:
				this.peliculas();
				break;
			case 2:
				this.cines();
				break;
			case 3:
				this.promociones();
				break;
			case 4:
				this.socio();
				break;
			case 5:
				this.dulceria();
				break;
			case 6:
				this.coorporativo();
				break;
			case 7:
				this.contactanos();
				break;
			case 8:
				pelicula ="El Plan del Asesino";
				this.pelicula();
				break;
			case 9:
				pelicula ="Hellboy";
				this.pelicula();
				break;
			case 10:
				pelicula ="La chica del Alquiler";
				this.pelicula();
				break;
			case 11:
				pelicula ="My Hero Academy";
				this.pelicula();;
				break;
			case 12:
				pelicula ="Guason 2";
				this.pelicula();
				break;
			case 13:
				pelicula ="La sustancia";
				this.pelicula();
				break;
			default:
				this.menuprincipal();
		}

	}
	public double total(){
		igv = total * 0.18;
		subtotal = total - igv;
		System.out.println("SUBTOTAL " + subtotal);
		System.out.println("IGV " + igv);
		System.out.println("TOTAL A PAGAR " + total);
		this.vuelto();
		return total;
	}
	public double vuelto(){
		System.out.println("Ingrese la cantidad a pagar:");
		pago = sc.nextDouble();
		vuelto = pago - total;
		if (vuelto < 0){
			System.out.println("Falta pagar " + -(vuelto));
			System.out.println("Completa el monto a pagar");
			resto = sc.nextDouble();
			if(-(vuelto) == resto){
				this.tiempo();
				System.out.println("Pago Completo");
				System.out.println("DISFRUTE SU PELICULA");
				System.out.println("--------- CINEPLANET --------");
			}
			else if (-(vuelto)<resto) {
				System.out.println("Usted tiene de vuelto: " + (resto + vuelto));
			}
			else{
				System.out.println("No tiene dinero, las butacas vuelven a estar disponibles ");
			}
		}
		else if (vuelto > 0){
			this.tiempo();
			System.out.println("\nSu vuelto es: " + vuelto);
			System.out.println("Pago Completo");
			System.out.println("DISFRUTE SU PELICULA");
			System.out.println("--------- CINEPLANET --------");
		}
		else {
			this.tiempo();
			System.out.println("Pago completo");
			System.out.println("DISFRUTE SU PELICULA");
			System.out.println("--------- CINEPLANET --------");
		}
		return vuelto;
	}
	public void socio(){}
	public void comprar(){
		if (Car1.equals("")){
		}
		else{
			this.costo();
		}
	}
	public double costo(){
		System.out.println("""
					Entradas Generales
					1. General 2D						4.General 3D
					S/.10								S/.18
					2. Mayores 60 años 2D				5.Mayores 60 años 3D
					s/.8								s/.15
					3. Niños 2D							6.Niños 3D
					s/.8								s/.15
					0. Regresar
					""");
		System.out.println("¿Que entradas quiere?:");
		opcion= sc.nextInt();
		System.out.println("¿Cuantas entradas quiere?");
		cantidad =sc.nextInt();
		switch (opcion){
			case 1:
				total = costo2d * cantidad;
				this.total();
			break;
			case 2:
				total = costoviejos * cantidad;
				this.total();
				break;
			case 3:
				total = costoniños2d * cantidad;
				this.total();
				break;
			case 4:
				total = costo3d * cantidad;
				this.total();
				break;
			case 5:
				total = costoviejos3d * cantidad;
				this.total();
				break;
			case 6:
				total = costoniños3d * cantidad;
				this.total();
				break;
			default:
				this.costo();
		}
		return total;
	}


	//FIORELLA
	//CINES
	public void cines(){
			sc.nextLine();
			System.out.println("""
                    
			CINES
			
			Filtrar por:
			
			1. Ciudad
			2. Formato
                    
					|-------------------------------|					|-------------------------------|
					|                      			|					|                      			|
					|   	  CP Alcazar (3)		|					|   	CP Mall Plaza (4)		|
					|	 Av. Santa Cruz 814 - 816	|					|	 Av. Ejercito 793 Cayma		|
					|    2D, REGULAR, 3D         	|					|    2D, REGULAR, 3D         	|
					|                      			|					|                      			|
					|-------------------------------|					|-------------------------------|
					
					|-------------------------------|					|-------------------------------|
					|                      			|					|                      			|
					|   	  CP Juliaca (5)		|					|   		CP Puno (6)			|
					|	 Calle Tumbes 395 			|					|	 Av. Los Incas s/n			|
					|    2D, REGULAR, 3D         	|					|    2D, REGULAR, 3D         	|
					|                      			|					|                      			|
					|-------------------------------|					|-------------------------------|
					
			0. Regresar
                    """);
			System.out.println("Elija el cine de su preferencia");
			cine = sc.nextInt();
			switch (cine) {
				case 1:
					this.cinesciudad();
					break;
				case 2:
					this.cinesformato();
					break;
				case 3:
					cine1 = "CP Alcazar";
					this.cine();
					break;
				case 4:
					cine1 = "CP Mall Plaza";
					this.cine();
					break;
				case 5:
					cine1 = "CP Juliaca";
					this.cine();
					break;
				case 6:
					cine1 = "CP Puno";
					this.cine();
					break;
				case 0:
					System.out.println("Regresando");
					this.menuprincipal();
					break;
				default:
					this.cines();

			}

	}
	public void cine(){

		this.peliculas();
	}
	public void asientos() {
		sc.nextLine();
		System.out.println("\n" + """
					1  2  3  4  5  6  7  8  9  10 11 12 	13 14 15
				
				A   ○  ○  ○  ○  ●  ○  ○  ○  ○  ○  ○  ○
				B	○  ○  ○  ○  ○  ○  ○  ○  ○  ○  ○  ○
				C	○  ●  ●  ○  ○  ○  ○  ○  ○  ○  ○  ○
				D	○  ○  ○  ○  ○  ●  ○  ○  ○  ○  ○  ○
				E	○  ○  ○  ○  ○  ○  ○  ○  ○  ○  ○  ○
				F	○  ●  ●  ○  ○  ○  ○  ○  ○  ○  ●  ○
				G	○  ○  ○  ○  ○  ○  ●  ○  ○  ○  ○  ○
				H	○  ○  ○  ○  ●  ○  ○  ○  ○  ○  ○  ○
				I	○  ○  ○  ○  ○  ○  ○  ○  ○  ○  ○  ○     	○  ●  ●
				J	○  ○  ○  ○  ○  ○  ●  ○  ○  ○  ○  ○		●  ○  ○
				
				Elegir un asiento con el siguiente formato("C2"):
				""");
		Car1 = sc.nextLine();
		if (Car1.equals("")) {
			this.comprar();
		}

	}
	public void tiempo(){
		if (tiempo ==1){
			System.out.println("""
							Usted esta comprando las siguientes butacas
							Asiento: """ + Car1 + "  "+"""
							Tiempo: 05:20 pm
							""");
			System.out.println("Lugar: "+cine1);
		} else if (tiempo ==2) {
			System.out.println("""
							Usted esta comprando las siguientes butacas
							Asiento: """ + Car1 + "  "+"""
							Tiempo: 10:20 pm
							""");
			System.out.println("Lugar: "+cine1);
		}
	}
	//CIUDADES
	public void cinesciudad(){
		this.ciudades();
		System.out.println("\nELIJA LA CIUDAD DEL CINE QUE DESEA VISITAR");
		cine = sc.nextInt();
		switch (cine){
			case 1:
				this.ciuLima();
				break;
			case 2:
				this.ciuArequipa();
				break;
			case 3:
				this.ciuCajamarca();
				break;
			case 4:
				this.ciuChiclayo();
				break;
			case 5:
				this.ciuCusco();
				break;
			case 6:
				this.ciuHuancayo();
				break;
			case 7:
				this.ciuHuanuco();
				break;
			case 8:
				this.ciuJuliaca();
				break;
			case 9:
				this.ciuPiura();
				break;
			case 10:
				this.ciuPucallpa();
				break;
			case 11:
				this.ciuPuno();
				break;
			case 12:
				this.ciuTacna();
				break;
			case 13:
				this.ciuTrujllo();
				break;
			case 0:
				this.cines();
			default:
				this.cinesciudad();
		}
	}
	public void ciuLima() {
		this.cinesLima();
		if (cine==0){
			this.cines();
		}else{
			this.cine();}
	}
	public void ciuArequipa() {
		this.cinesArequipa();
		if (cine==0){
			this.cines();
		}else{
			this.cine();}
	}
	public void ciuCajamarca() {
		this.cinesCajamarca();
		if (cine==0){
			this.cines();
		}else{
			this.cine();}
	}
	public void ciuChiclayo() {
		this.cinesChiclayo();
		if (cine==0){
			this.cines();
		}else{
			this.cine();}
	}
	public void ciuCusco() {
		this.cinesCusco();
		if (cine==0){
			this.cines();
		}else{
			this.cine();}
	}
	public void ciuHuancayo() {
		this.cinesHuancayo();
		if (cine==0){
			this.cines();
		}else{
			this.cine();}
	}
	public void ciuHuanuco() {
		this.cinesHuanuco();
		if (cine==0){
			this.cines();
		}else{
			this.cine();}
	}
	public void ciuJuliaca() {
		this.cinesJuliaca();
		if (cine==0){
			this.cines();
		}else{
			this.cine();}
	}
	public void ciuPiura() {
		this.cinesPiura();
		if (cine==0){
			this.cines();
		}else{
			this.cine();}
	}
	public void ciuPucallpa() {
		this.cinesPucallpa();
		if (cine==0){
			this.cines();
		}else{
			this.cine();}
	}
	public void ciuPuno() {
		this.cinesPuno();
		if (cine==0){
			this.cines();
		}else{
			this.cine();}
	}
	public void ciuTacna() {
		this.cinesTacna();
		if (cine==0){
			this.cines();
		}else{
			this.cine();}
	}
	public void ciuTrujllo() {
		this.cinesTrujllo();
		if (cine==0){
			this.cines();
		}else{
			this.cine();}
	}
	//FORMATO
	public void cinesformato(){
		System.out.println("TODAS LOS FORMATOS");
		System.out.println("1. 2D");
		System.out.println("2. 3D");
		System.out.println("3. REGULAR");
		System.out.println("\nELIJA EL FORMATO DE PELICULA QUE DESEA VER");
		cine = sc.nextInt();
		switch (cine){
			case 1:
				this.cine2d();
				break;
			case 2:
				this.cine3d();
				break;
			case 3:
				this.cineregular();
				break;
			case 0:
				this.cines();
			default:
				this.cinesformato();
		}
	}
	public void cine2d(){
		System.out.println("""
					
					|-------------------------------|					|-------------------------------|
					|                      			|					|                      			|
					|   	  CP Alcazar (1)		|					|   		CP Brasil (2)		|
					|	 Av. Santa Cruz 814 - 816	|					|	 Av. Brasil 714 - 792		|
					|    2D, REGULAR, 3D         	|					|    2D, REGULAR, 3D         	|
					|                      			|					|                      			|
					|-------------------------------|					|-------------------------------|
					
					|-------------------------------|					|-------------------------------|
					|                      			|					|                      			|
					|    CP Caminos del Inca (3)    |					|   	CP El Polo (4)			|
					|	 Av. Inca 241 				|					|	 Av. El Polo 695			|
					|    2D, REGULAR, 3D         	|					|    2D, REGULAR, 3D         	|
					|                      			|					|                      			|
					|-------------------------------|					|-------------------------------|
					
					|-------------------------------|					|-------------------------------|
					|                      			|					|                      			|
					|   CP Arequipa Mall Plaza (5)	|					|    CP Paseo Central (6)		|
					|	Av. Ejercito 814 - 816		|					|	 Av. Arturo Ibañez s/n		|
					|   2D, REGULAR, 3D         	|					|    2D, REGULAR	        	|
					|                      			|					|                      			|
					|-------------------------------|					|-------------------------------|
					
					|-------------------------------|					|-------------------------------|
					|                      			|					|                      			|
					|   CP Chiclayo Mall Plaza (7)	|					|  CP Chiclayo Real Plaza (8)	|
					|	Av. Panamericana 814 - 816	|					|  Av. Miguel Cervantes 300		|
					|   2D, REGULAR, 3D         	|					|  2D, REGULAR, 3D	        	|
					|                      			|					|                      			|
					|-------------------------------|					|-------------------------------|
					
				
				0. Regresar
				
				ELIJA UN CINE:	
				""");
		cine = sc.nextInt();
		switch (cine){
			case 1:
				cine1= "CP Alcazar";
				this.cine();
				break;
			case 2:
				cine1= "CP Brasil";
				this.cine();
				break;
			case 3:
				cine1= "CP Caminos del Inca";
				this.cine();
				break;
			case 4:
				cine1= "CP El Polo";
				this.cine();
				break;
			case 5:
				cine1= "Arequipa Mall Plaza";
				this.cine();
				break;
			case 6:
				cine1= "CP Paseo Central";
				this.cine();
				break;
			case 7:
				cine1= "Chiclayo Mall Plaza";
				this.cine();
				break;
			case 8:
				cine1= "Chiclayo Real Plaza";
				this.cine();
				break;
			case 0:
				this.cines();
				break;
			default:
				this.cine2d();
		}
	}
	public void cineregular(){
		System.out.println("""
					
					|-------------------------------|					|-------------------------------|
					|                      			|					|                      			|
					|   	  CP Alcazar (1)		|					|   		CP Brasil (2)		|
					|	 Av. Santa Cruz 814 - 816	|					|	 Av. Brasil 714 - 792		|
					|    2D, REGULAR, 3D         	|					|    2D, REGULAR, 3D         	|
					|                      			|					|                      			|
					|-------------------------------|					|-------------------------------|
					
					|-------------------------------|					|-------------------------------|
					|                      			|					|                      			|
					|    CP Caminos del Inca (3)    |					|   	CP El Polo (4)			|
					|	 Av. Inca 241 				|					|	 Av. El Polo 695			|
					|    2D, REGULAR, 3D         	|					|    2D, REGULAR, 3D         	|
					|                      			|					|                      			|
					|-------------------------------|					|-------------------------------|
					
					|-------------------------------|					|-------------------------------|
					|                      			|					|                      			|
					|   CP Arequipa Mall Plaza (5)	|					|    CP Paseo Central (6)		|
					|	Av. Ejercito 814 - 816		|					|	 Av. Arturo Ibañez s/n		|
					|   2D, REGULAR, 3D         	|					|    2D, REGULAR	        	|
					|                      			|					|                      			|
					|-------------------------------|					|-------------------------------|
					
					|-------------------------------|					|-------------------------------|
					|                      			|					|                      			|
					|   CP Chiclayo Mall Plaza (7)	|					|  CP Chiclayo Real Plaza (8)	|
					|	Av. Panamericana 814 - 816	|					|  Av. Miguel Cervantes 300		|
					|   2D, REGULAR, 3D         	|					|  2D, REGULAR, 3D	        	|
					|                      			|					|                      			|
					|-------------------------------|					|-------------------------------|
					
				
				0. Regresar
				
				ELIJA UN CINE:	
				""");
		cine = sc.nextInt();
		switch (cine){
			case 1:
				cine1= "CP Alcazar";
				this.cine();
				break;
			case 2:
				cine1= "CP Brasil";
				this.cine();
				break;
			case 3:
				cine1= "CP Caminos del Inca";
				this.cine();
				break;
			case 4:
				cine1= "CP El Polo";
				this.cine();
				break;
			case 5:
				cine1= "Arequipa Mall Plaza";
				this.cine();
				break;
			case 6:
				cine1= "CP Paseo Central";
				this.cine();
				break;
			case 7:
				cine1= "Chiclayo Mall Plaza";
				this.cine();
				break;
			case 8:
				cine1= "Chiclayo Real Plaza";
				this.cine();
				break;
			case 0:
				this.cines();
				break;
			default:
				this.cine2d();
		}
	}
	public void cine3d(){
		System.out.println("""
					
					|-------------------------------|					|-------------------------------|
					|                      			|					|                      			|
					|   	  CP Alcazar (1)		|					|   		CP Brasil (2)		|
					|	 Av. Santa Cruz 814 - 816	|					|	 Av. Brasil 714 - 792		|
					|    2D, REGULAR, 3D         	|					|    2D, REGULAR, 3D         	|
					|                      			|					|                      			|
					|-------------------------------|					|-------------------------------|
					
					|-------------------------------|					|-------------------------------|
					|                      			|					|                      			|
					|    CP Caminos del Inca (3)    |					|   	CP El Polo (4)			|
					|	 Av. Inca 241 				|					|	 Av. El Polo 695			|
					|    2D, REGULAR, 3D         	|					|    2D, REGULAR, 3D         	|
					|                      			|					|                      			|
					|-------------------------------|					|-------------------------------|
					
					|-------------------------------|					|-------------------------------|
					|                      			|					|                      			|
					|   CP Arequipa Mall Plaza (5)	|					|    	 CP Juliaca (6) 		|
					|	Av. Ejercito 814 - 816		|					|	 Calle Tumbes s/n			|
					|   2D, REGULAR, 3D         	|					|    2D, REGULAR,  3D	       	|
					|                      			|					|                      			|
					|-------------------------------|					|-------------------------------|
					
					|-------------------------------|					|-------------------------------|
					|                      			|					|                      			|
					|   	CP Trujillo(7)			|					|  	CP Trujillo Real Plaza (8)	|
					|	Jr. Marisacal 537			|					|  	Av. Cesar Vallejo 1345		|
					|   2D, REGULAR, 3D	        	|					|  	2D, REGULAR, 3D	        	|
					|                      			|					|                      			|
					|-------------------------------|					|-------------------------------|
					
				
				0. Regresar
				
				ELIJA UN CINE:	
				""");
		cine = sc.nextInt();
		switch (cine){
			case 1:
				cine1= "CP Alcazar";
				this.cine();
				break;
			case 2:
				cine1= "CP Brasil";
				this.cine();
				break;
			case 3:
				cine1= "CP Caminos del Inca";
				this.cine();
				break;
			case 4:
				cine1= "CP El Polo";
				this.cine();
				break;
			case 5:
				cine1= "Arequipa Mall Plaza";
				this.cine();
				break;
			case 6:
				cine1= "CP Juliaca";
				this.cine();
				break;
			case 7:
				cine1= "Trujillo";
				this.cine();
				break;
			case 8:
				cine1= "Trujillo Real Plaza";
				this.cine();
				break;
			case 0:
				this.cines();
				break;
			default:
				this.cine3d();
		}
	}
	//PELICULAS
	public void peliculas() {
		System.out.println("\nEn "+ cine1 + " tenemos las siguientes peliculas:");
		System.out.println( """
1)El Plan Del Asesino
2)Hellboy: The Crooked Man
3)La Chica del Alquile
4)My Hero Academia : Ahora es tu Turno
5)Guasón 2: Folie À Deux
6)La Sustancia
7)No Hables con Extraños
8)Robot Salvaje
9)Transformers Uno

0)Regresar
""");
		pelicula1 = sc.nextInt();
		switch (pelicula1) {
			case 1:
				pelicula ="El Plan del Asesino";
				this.pelicula();
				break;
			case 2:
				pelicula ="Hellboy: The Crooked Man";
				this.pelicula();
				break;
			case 3:
				pelicula ="My Hero Academia \n: Ahora es tu Turno";
				this.pelicula();
				break;
			case 4:
				pelicula ="El Plan del Asesino";
				this.pelicula();
				break;
			case 5:
				pelicula ="Guasón 2: Folie À Deux";
				this.pelicula();
				break;
			case 6:
				pelicula ="La Sustancia";
				this.pelicula();
			case 7:
				pelicula ="No Hables con Extraños";
				this.pelicula();
			case 8:
				pelicula ="Robot Salvaje";
				this.pelicula();
			case 9:
				pelicula ="Transformers UNO";
				this.pelicula();
				break;
			case 0:
				this.menuprincipal();
				break;
			default:
				System.out.println("\n");
				this.peliculas();
		}

	}
	public void pelicula() {
		this.contenido();
		System.out.println("\n" +"""
					Tenemos los siguientes horarios:
					1) 05:20 pm
					2) 10:20 pm
					0) para regresar
					Ingresar una opcion:""");
		tiempo = sc.nextInt();
			switch (tiempo) {
				case 1:
					this.asientos();
					break;
				case 2:
					this.asientos();
					break;
				case 0:
					this.peliculas();
					break;
				default:
					System.out.println("Opcion no valida.");
					this.pelicula();
			}
	}
	public void contenido(){
		System.out.println("""
                |-----------------------|
                |        Sinopsis       |
                |""" +"       "+ pelicula+ """  
                      |
                |Lorem ip               |
                |      Lorem ipsu       |
                |            Lorem Ipsum|
                |                       |
                |                       |
                |-----------------------|
                """);
	}


	//PAMELA
	//PROMOCIONES
	public void promociones(){
		System.out.print("""
				
				1)
				Eres ENTEL,								|---------------------------|
				eres CINE								|	  #########     == \s	|
				                  						|	############# =====\s	|
				Cine todo el año                 		|	#####    #####  ====	|
				                  						|	##############  ====	|
				|---------------------------|           |	##############  ====	|
				|  Terminos y Condiciones   |           |	#####           ====	|
				|---------------------------|	        |	############# ======	|
				                    					|	  ##########   === \s	|
														|---------------------------|
				""");
		System.out.println("""
				
				2)
				Obten tu								|---------------------------|
				combo									|	  #########     == \s	|
				Entel Mix                  				|	############# =====\s	|
				hasta el                 				|	#####    #####  ====	|
				10.11                  					|	##############  ====	|
				          								|	##############  ====	|
				|---------------------------|           |	#####           ====	|
				|  Terminos y Condiciones   |	        |	############# ======	|
				|---------------------------|           |	  ##########   === \s	|
														|---------------------------|
				""");
		System.out.println("0. Regresar");
		System.out.println("Leer Terminos y Condiciones");
		opcion=sc.nextInt();
		switch(opcion){
			case 1:
				this.promocion1();
				break;
			case 2:
				this.promocion2();
				break;
			case 0:
				this.menuprincipal();
			default:
				this.promociones();
		}
	}
	public void promocion1(){
		System.out.println("""
				TÉRMINOS Y CONDICIONES GENERALES DE LA PROMOCIÓN:
				• El código que otorgará Entel a sus usuarios se realizará a través de SMS y de la
				App Mi Entel. Dicha entrega deberá contar con la siguiente información: (i)
				código alfanumérico; (ii) vigencia; y, (iv) nombre del remitente.
				• El cliente podrá canjear el código en la página web, aplicativo móvil de
				Cineplanet o boletería que se encuentren habilitadas en Cineplanet,
				registrando los códigos que se han adquirido de Entel.
				• Para el caso de página web y aplicativo móvil de Cineplanet, el cliente deberá
				entrar a la Web o App de Cineplanet y digitar el código en la sección “Canjea
				tus códigos” para la función elegida de la semana. En boleterías, los códigos se
				deberán mostrar directamente desde la App Entel o el SMS recibido.
				• Válido para clientes con líneas activas Entel prepago, postpago, hogar y
				corporativas (móvil, BAM, BAFI).
				• Códigos son válidos solo durante la semana en que se solicitaron (semana
				considerada desde las 00:00:01 horas del lunes hasta las 23:59:59 horas del
				domingo).
				• Máximo 2 códigos a la semana por línea celular y/o por servicio fijo
				contratado.
				• Beneficio aplica sobre el precio de 1 entrada general del día que se utilice la
				promoción.
				• No válido las capturas de pantallas.
				• No válido para películas en semana de estreno ni para películas bloqueadas
				por el distribuidor. No aplica con otras promociones.
				• No válido para películas en preestreno, ni contenido alternativo emitido por
				Cineplanet (conciertos, animes, unipersonales, campeonatos, entre otros),
				Festiplanet o Día del Cine.
				• Acumula puntos y visitas para los clientes inscritos en el programa Socio
				Cineplanet. Para realizar el canje de su código el cliente Entel debe ingresar o
				registrarse como Socio Cineplanet. Esta condición será obligatoria para que
				los clientes Entel puedan acumular los beneficios propios del programa Socio
				Cineplanet.""");
		System.out.println("0. Regresar");
	}
	public void promocion2(){
		System.out.println("""
				Condiciones generales del beneficio JUEVES ENTEL S/10 dto en Combo 2 Mix – “Combo ENTEL”
				• La promoción podrá ser solicitada enviando un SMS con la palabra CONFITERIA al 144 o
				mediante el AppEntel el jueves 03/10/2024 (desde las 11:00:00 hasta 23:59:59).
				• Válido para clientes Entel con líneas y servicios activos (Entel prepago, postpago,
				empresa móvil, hogar y corporativas).
				• Si eres Entel prepago, postpago o empresa móvil: por la App Entel o enviando un SMS
				con la palabra CONFITERIA al 144 el 03/10/2024 (desde las 11:00 AM hasta las 23:59:59
				hrs.).
				• Si eres Entel Hogar: por la App Entel el 03/10/2024 (desde las 11:00 AM hasta las
				23:59:59 hrs.).
				• Si eres Entel empresas con servicios fijos BAM/BAFI deberás ingresar por la App Entel el
				03/10/2024 (desde las 11:00 AM hasta las 23:59:59 hrs.).
				• Si eres Entel empresas con servicios fijos TI, enlace de datos, servicios de seguridad,
				Fibra y VAS deberás ingresar al link https://www.entel.pe/jsf que te deriva al WhatsApp
				Entel 981002000 y tendrás que seleccionar la opción de CONFITERIA el 03/10/2024
				(desde las 11:00 AM hasta las 23:59:59 hrs.).
				• Cada cliente puede solicitar a Entel como máximo 1 código por línea celular y/o servicio
				hogar contratado que equivale a S/10 dto en un Combo 2 Mix (1 Canchita Gigante Mixta
				+ 2 Bebidas 32 oz) de Cineplanet. El descuento se aplica sobre el precio del Combo 2 Mix
				según el cine elegido.
				• Adicionalmente, por la compra del combo con el código de descuento, se le obsequiará
				un vaso Entel.
				• Para realizar el canje del código, primero el cliente deberá, al momento de realizar su
				pedido, indicar que desea adquirir el “combo ENTEL” debiendo presentar el código o
				dictar el código enviado por SMS o solicitado por el App ENTEL. De no indicar que desea
				adquirir el combo ENTEL y/o no entregar el código activo y vigente, su pedido será
				comandado a precio regular de cada local y no podrá ser modificado.
				• No válido las capturas de pantallas para canjear el beneficio.
				• Promoción no válida para compra por canales digitales, app o web de Cineplanet. La
				redención del código es sólo de manera presencial en el área de Confitería del Cine
				durante el horario de atención.
				• Códigos son válidos sólo durante las fechas de vigencia de la campaña (desde las 11:00
				am del 03 de octubre hasta las 23:59:59 horas del domingo 10 de noviembre).
				• Para ver los locales que ingresan en la promoción ingresar a
				https://www.cineplanet.com.pe/
				• Los horarios de atención dependen de cada local de Cineplanet y podrán variar de
				acuerdo con la coyuntura según disposiciones del gobierno y las entidades ediles.
				• La entrega del bucket brandeado y vasos por aniversario está sujeto a disponibilidad del
				local. El stock es limitado.
				• Stock mínimo de códigos para la campaña: 1000.
				• Stock máximo de vasos y cajas brandeadas por campaña: 37 000. Agotado este stock, se
				entregará el Combo 2 Mix sin bucket brandeado y sin vaso Entel.
				• Promoción válida de lunes a domingo incluido feriado.
				• Códigos no ampliables, no renovables.
				• No aplica Refil.
				• Prohibido la reventa.
				• Bebida a entregar sólo gaseosa.
				• Válido sólo para pop corn mixto, no válido para opción salada o dulce.
				• Cineplanet no se hace responsable por el mal manejo de los códigos.""");
		System.out.println("0. Regresar");
	}
	//DULCERIA
	public void dulceria(){
		this.ciudades();
		System.out.println("\nEscoga un cineplanet para comprar productos de nuestra dulceria");
		cine = sc.nextInt();
		switch (cine){
			case 1:
				this.cinesLima();
				if(cine==0){
					this.dulceria();
				}
				else {
					this.dulceria1();
				}
				break;
			case 2:
				this.cinesArequipa();
				if(cine==0){
					this.dulceria();
				}
				else {
					this.dulceria1();
				}
				break;
			case 3:
				this.cinesCajamarca();
				if(cine==0){
					this.dulceria();
				}
				else {
					this.dulceria1();
				}
				break;
			case 4:
				this.cinesChiclayo();
				if(cine==0){
					this.dulceria();
				}
				else {
					this.dulceria1();
				}
				break;
			case 5:
				this.cinesCusco();
				if(cine==0){
					this.dulceria();
				}
				else {
					this.dulceria1();
				}
				break;
			case 6:
				this.cinesHuancayo();
				if(cine==0){
					this.dulceria();
				}
				else {
					this.dulceria1();
				}
				break;
			case 7:
				this.cinesHuanuco();
				if(cine==0){
					this.dulceria();
				}
				else {
					this.dulceria1();
				}
				break;
			case 8:
				this.cinesJuliaca();
				if(cine==0){
					this.dulceria();
				}
				else {
					this.dulceria1();
				}
				break;
			case 9:
				this.cinesPiura();
				if(cine==0){
					this.dulceria();
				}
				else {
					this.dulceria1();
				}
				break;
			case 10:
				this.cinesPucallpa();
				if(cine==0){
					this.dulceria();
				}
				else {
					this.dulceria1();
				}
				break;
			case 11:
				this.cinesPuno();
				if(cine==0){
					this.dulceria();
				}
				else {
					this.dulceria1();
				}
				break;
			case 12:
				this.cinesTacna();
				if(cine==0){
					this.dulceria();
				}
				else {
					this.dulceria1();
				}
				break;
			case 13:
				this.cinesTrujllo();
				if(cine==0){
					this.dulceria();
				}
				else {
					this.dulceria1();
				}
				break;
			case 0:
				this.menuprincipal();
			default:
				this.dulceria();
		}
	}
	public void dulceria1(){
		System.out.print("\n						1. PROMOCIONAL");
		System.out.print("		2. COMBO");
		System.out.print("		3. CANCHITA");
		System.out.print("		4. BEBIDAS");
		System.out.println("		5. GOLOSINAS");
		System.out.println("\nSeleccione que quiere comprar:");
		opcion= sc.nextInt();
		switch (opcion){
			case 1:
				this.dulceriapromocional();
				break;
			case 2:
				this.dulceriacombo();
				break;
			case 3:
				this.dulceriacanchita();
				break;
			case 4:
				this.bebidas();
				break;
			case 5:
				this.golosinas();
				break;
			default:
					this.dulceria1();

		}
	}
	public void dulceriapromocional(){
		System.out.print("\nUsted escogio ");
		System.out.println(ciudad + ", "+ cine1 +"\n");
		System.out.println("Tenemos los siguientes combos: "+ "\n"+
			"""
					|-------------------------------|			|-------------------------------|			|-------------------------------|
					|  (1)COMBO DOS SALADO + 2 M&M  |			|  (2)COMBO DOS DULCE + 2 M&M   |			|    (3)COMBO DOS MIX + 2 M&M   |
					|                      			|			|                      			|			|                      			|
					| 1 Canchita Gigante (Salada) + |			| 1 Canchita Gigante (Dulce) +  |			|   1 Canchita Gigante (Mix) +  |
					|   2 Bebida (32oz) + 2 M&M's.  |			|   2 Bebida (32oz) + 2 M&M's.  |			|   2 Bebida (32oz) + 2 M&M's.  |
					|                      			|			|                      			|			|                      			|
					|                      S/. 47.00|			|                      S/. 51.00|			|                      S/. 51.00|
					|-------------------------------|			|-------------------------------|			|-------------------------------|
			""");
		System.out.println("0. Regresar");
	}
	public void dulceriacombo(){
		System.out.print("\nUsted escogio ");
		System.out.println(ciudad + ", "+ cine1 +"\n");
		System.out.println("Tenemos los siguientes combos: "+ "\n"+
				"""
                        |-------------------------------|			|-------------------------------|			|-------------------------------|
                        |  	 (1)COMBO 2 DULCE OL CC 	|			|  	 (2)COMBO 2 SALADO OL CC 	|			|  	   (3)COMBO 2 MIX OL CC 	|
                        |                      			|			|                      			|			|                      			|
                        |  1 Canchita Gigante (Dulce) + |			| 1 Canchita Gigante (Salado) + |			|  	1 Canchita Gigante (Mix) + 	|
                        |   	  2 Bebida (32oz)   	|			|   	  2 Bebida (32oz)   	|			|   	  2 Bebida (32oz)   	|
                        |                      			|			|                      			|			|                      			|
                        |                      S/. 35.00|			|                      S/. 31.00|			|                      S/. 35.00|
                        |-------------------------------|			|-------------------------------|			|-------------------------------|
                """);
		System.out.println("\n"+
				"""
                        |-------------------------------|			|-------------------------------|			|-------------------------------|
                        | (4)COM. 2 SALADO DOB. GIG. OL |			| (5)COM. 2 DULCE DOB. GIG. OL  |			| 	(6)COM. 2 MIX DOB. GIG. OL  |
                        |                      			|			|                      			|			|                      			|
                        | 2 Canchita Gigante (Salado) + |			| 2 Canchita Gigante (Dulce) + |			|  	2 Canchita Gigante (Mix) + 	|
                        |   	  2 Bebida (32oz)   	|			|   	  2 Bebida (32oz)   	|			|   	  2 Bebida (32oz)   	|
                        |                      			|			|                      			|			|                      			|
                        |                      S/. 40.00|			|                      S/. 44.00|			|                      S/. 44.00|
                        |-------------------------------|			|-------------------------------|			|-------------------------------|
                """);
		System.out.println("0. Regresar");
	}
	public void dulceriacanchita(){
		System.out.print("\nUsted escogio ");
		System.out.println(ciudad + ", "+ cine1 +"\n");
		System.out.println("Tenemos las siguientes canchitas: "+ "\n"+
				"""
                        |-------------------------------|			|-------------------------------|			|-------------------------------|
                        |  	 (1)CANCHITA GIGANTE MIX	|			|  	(2)CANCHITA GIGANTE DULCE	|			|  	(3)CANCHITA GIGANTE SALADO	|
                        |                      			|			|                      			|			|                      			|
                        |  1 Canchita Gigante (Mix)  	|			|   1 Canchita Gigante (Dulce)	|			|  1 Canchita Gigante (Salado)  |
                        |   							|			|   	   					   	|			|   	   					   	|
                        |                      			|			|                      			|			|                      			|
                        |                      S/. 24.50|			|                      S/. 24.50|			|                      S/. 20.50|
                        |-------------------------------|			|-------------------------------|			|-------------------------------|
                """);
		System.out.println("\n"+
				"""
                        				|-------------------------------|			|-------------------------------|
                        				|   (4)CANCHITA GRANDE SALADO	|			|  	 (5)CANCHITA GRANDE DULCE	|
                        				|                      			|			|                      			|
                        				|   1 Canchita Grande (Mix)  	|			|   1 Canchita Gigante (Dulce)	|
                        				|   							|			|   	   					   	|
                        				|                      			|			|                      			|
                        				|                      S/. 14.00|			|                      S/. 17.00|
                        				|-------------------------------|			|-------------------------------|
                """);
		System.out.println("\n"+
				"""
                        				|-------------------------------|			|-------------------------------|
                        				|  (6)CANCHITA MEDIANA SALADO	|			|  	(7)CANCHITA MEDIANA DULCE	|
                        				|                      			|			|                      			|
                        				|   1 Canchita Grande (Mix)  	|			|   1 Canchita Gigante (Dulce)	|
                        				|   							|			|   	   					   	|
                        				|                      			|			|                      			|
                        				|                      S/. 12.00|			|                      S/. 14.00|
                        				|-------------------------------|			|-------------------------------|
                """);
		System.out.println("0. Regresar");
	}
	public void bebidas(){
		System.out.print("\nUsted escogio ");
		System.out.println(ciudad + ", "+ cine1 +"\n");
		System.out.println("Tenemos las siguientes bebidas: "+ "\n"+
				"""
                        |-------------------------------|			|-------------------------------|			|-------------------------------|
                        |  	 (1)BEBIDA MEDIANA CC OL	|			|  	  (2)BEBIDA GRANDE CC OL	|			|  	(3) AGUA SAN LUIS SIN  GAS	|
                        |                      			|			|                      			|			|                      			|
                        |  1 Canchita Gigante (Mix)  	|			|   1 Canchita Gigante (Dulce)	|			|  1 Canchita Gigante (Salado)  |
                        |   							|			|   	   					   	|			|   	   					   	|
                        |                      			|			|                      			|			|                      			|
                        |                      S/. 10.50|			|                      S/. 12.00|			|                       S/. 4.00|
                        |-------------------------------|			|-------------------------------|			|-------------------------------|
                """);
		System.out.println("0. Regresar");
	}
	public void golosinas(){
		System.out.print("\nUsted escogio ");
		System.out.println(ciudad + ", "+ cine1 +"\n");
		System.out.println("Tenemos las siguientes golosinas: "+ "\n"+
				"""
                        |-------------------------------|			|-------------------------------|			|-------------------------------|
                        |  	(1)M&Ms MILK CHOCOLATE 45G	|			|  	  	(2)M&Ms PEANUT 45G		|			|  (3)CHOCOLATE BISCOLATA MOOD 	|
                        |                      			|			|                      			|			|                      			|
                        |  							  	|			|   							|			|  								 |
                        |   							|			|   	   					   	|			|   	   					   	|
                        |                      			|			|                      			|			|                      			|
                        |                      	S/. 9.00|			|                       S/. 9.00|			|                       S/. 3.50|
                        |-------------------------------|			|-------------------------------|			|-------------------------------|
                """);
		System.out.println("0. Regresar");
	}


	//DEISSY
	//COORPORATIVO
	public void coorporativo(){
		System.out.println("---Corporativo---");
		System.out.println("Conoce nuestros productos");
		System.out.println("Seleccione el producto de su interes");
		System.out.println("Opcion 1: Eventos");
		System.out.println("Opcion 2: Funciones Especiales");
		System.out.println("Opcion 3: Entradas y Combos");
		System.out.println("Opcion 4: Planet Fiesta");
		System.out.println("Opcion 5: Publicidad");
		System.out.println("Opcion 6: At Work");
		System.out.println("Opcion 0: Regresar");
		int opcion=sc.nextInt();
		sc.nextLine();
		switch(opcion){
			case 1:
				this.eventos();
				break;
			case 2:
				this.funciones_especiales();
				break;
			case 3:
				this.entradas_y_combos();
				break;
			case 4:
				this.planet_fiesta();
				break;
			case 5:
				this.publicidad();
				break;
			case 6:
				this.at_work();
				break;
			case 0:
				this.menuprincipal();
				break;
			default:
				this.coorporativo();
		}
	}
	public void eventos(){
		System.out.println("""
				EVENTOS
				
				Cuéntanos un poco más sobre tu solicitud y nuestro equipo se pondrá en contacto contigo.
				Por favor considerar los datos reales de empresa y contacto para atender tu solicitud.
				
						|-------------------------|				|-------------------------|
						| Regresar a Productos(1) |				|   Iniciar Solicitud(2)  |
						|-------------------------|				|-------------------------|
				
				Elija una opcion:""");
		opcion = sc.nextInt();
		switch(opcion){
			case 1:
				this.coorporativo();
				break;
			case 2:
				this.solicitudevento();
				break;
			default:
				this.eventos();

		}
	}
	public void funciones_especiales(){
		System.out.println("""
				EVENTOS
				
				Cuéntanos un poco más sobre tu solicitud y nuestro equipo se pondrá en contacto contigo.
				Por favor considerar los datos reales de empresa y contacto para atender tu solicitud.
				
						|-------------------------|				|-------------------------|
						| Regresar a Productos(1) |				|   Iniciar Solicitud(2)  |
						|-------------------------|				|-------------------------|
				
				Elija una opcion:""");
		opcion = sc.nextInt();
		switch(opcion){
			case 1:
				this.coorporativo();
				break;
			case 2:
				this.solicitudevento();
				break;
			default:
				this.eventos();

		}
	}
	public void entradas_y_combos(){
		System.out.println("""
				EVENTOS
				
				Cuéntanos un poco más sobre tu solicitud y nuestro equipo se pondrá en contacto contigo.
				Por favor considerar los datos reales de empresa y contacto para atender tu solicitud.
				
						|-------------------------|				|-------------------------|
						| Regresar a Productos(1) |				|   Iniciar Solicitud(2)  |
						|-------------------------|				|-------------------------|
				
				Elija una opcion:""");
		opcion = sc.nextInt();
		switch(opcion){
			case 1:
				this.coorporativo();
				break;
			case 2:
				this.solicitudevento();
				break;
			default:
				this.eventos();

		}
	}
	public void planet_fiesta(){
		System.out.println("""
				EVENTOS
				
				Cuéntanos un poco más sobre tu solicitud y nuestro equipo se pondrá en contacto contigo.
				Por favor considerar los datos reales de empresa y contacto para atender tu solicitud.
				
						|-------------------------|				|-------------------------|
						| Regresar a Productos(1) |				|   Iniciar Solicitud(2)  |
						|-------------------------|				|-------------------------|
				
				Elija una opcion:""");
		opcion = sc.nextInt();
		switch(opcion){
			case 1:
				this.coorporativo();
				break;
			case 2:
				this.solicitudevento();
				break;
			default:
				this.eventos();

		}
	}
	public void publicidad(){
		System.out.println("""
				EVENTOS
				
				Cuéntanos un poco más sobre tu solicitud y nuestro equipo se pondrá en contacto contigo.
				Por favor considerar los datos reales de empresa y contacto para atender tu solicitud.
				
						|-------------------------|				|-------------------------|
						| Regresar a Productos(1) |				|   Iniciar Solicitud(2)  |
						|-------------------------|				|-------------------------|
				
				Elija una opcion:""");
		opcion = sc.nextInt();
		switch(opcion){
			case 1:
				this.coorporativo();
				break;
			case 2:
				this.solicitudevento();
				break;
			default:
				this.eventos();

		}
	}
	public void at_work(){
		System.out.println("""
				EVENTOS
				
				Cuéntanos un poco más sobre tu solicitud y nuestro equipo se pondrá en contacto contigo.
				Por favor considerar los datos reales de empresa y contacto para atender tu solicitud.
				
						|-------------------------|				|-------------------------|
						| Regresar a Productos(1) |				|   Iniciar Solicitud(2)  |
						|-------------------------|				|-------------------------|
				
				Elija una opcion:""");
		opcion = sc.nextInt();
		switch(opcion){
			case 1:
				this.coorporativo();
				break;
			case 2:
				this.solicitudevento();
				break;
			default:
				this.eventos();

		}
	}
	public void solicitudevento(){
		System.out.println("TODOS LOS EVENTOS");
		System.out.println("1. Zona Gamer");
		System.out.println("2. Zona Reunion");
		System.out.println("3. Conferencias");
		System.out.println("4. Capacitacion");
		System.out.println("5. Congreso");
		System.out.println("6. Seminario");
		System.out.println("7. Lanzamiento");
		System.out.println("8. Presentaciones");
		System.out.println("9. Club de Fans");
		System.out.println("0. Regresar");
		System.out.println("Escoga cual evento quiere cotizar");
		opcion = sc.nextInt();
		switch(opcion){
			case 1:
				evento = "Zona Gamer";
				this.ciudades();
				System.out.println("\nEscoga un cineplanet para poder reservar");
				cine = sc.nextInt();
				switch (cine){
					case 1:
						this.cinesLima();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 2:
						this.cinesArequipa();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 3:
						this.cinesCajamarca();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 4:
						this.cinesChiclayo();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 5:
						this.cinesCusco();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 6:
						this.cinesHuancayo();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 7:
						this.cinesHuanuco();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 8:
						this.cinesJuliaca();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 9:
						this.cinesPiura();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 10:
						this.cinesPucallpa();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 11:
						this.cinesPuno();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 12:
						this.cinesTacna();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 13:
						this.cinesTrujllo();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 0:
						this.eventos();
					default:
						this.solicitudevento();
				}
				break;
			case 2:
				evento = "Zona Reunion";
				this.ciudades();
				System.out.println("\nEscoga un cineplanet para poder reservar");
				cine = sc.nextInt();
				switch (cine){
					case 1:
						this.cinesLima();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 2:
						this.cinesArequipa();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 3:
						this.cinesCajamarca();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 4:
						this.cinesChiclayo();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 5:
						this.cinesCusco();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 6:
						this.cinesHuancayo();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 7:
						this.cinesHuanuco();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 8:
						this.cinesJuliaca();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 9:
						this.cinesPiura();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 10:
						this.cinesPucallpa();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 11:
						this.cinesPuno();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 12:
						this.cinesTacna();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 13:
						this.cinesTrujllo();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 0:
						this.eventos();
					default:
						this.solicitudevento();
				}
				break;
			case 3:
				evento="Conferencias";
				this.ciudades();
				System.out.println("\nEscoga un cineplanet para poder reservar");
				cine = sc.nextInt();
				switch (cine){
					case 1:
						this.cinesLima();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 2:
						this.cinesArequipa();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 3:
						this.cinesCajamarca();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 4:
						this.cinesChiclayo();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 5:
						this.cinesCusco();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 6:
						this.cinesHuancayo();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 7:
						this.cinesHuanuco();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 8:
						this.cinesJuliaca();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 9:
						this.cinesPiura();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 10:
						this.cinesPucallpa();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 11:
						this.cinesPuno();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 12:
						this.cinesTacna();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 13:
						this.cinesTrujllo();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 0:
						this.eventos();
					default:
						this.solicitudevento();
				}
				break;
			case 4:
				evento="Capacitacion";
				this.ciudades();
				System.out.println("\nEscoga un cineplanet para poder reservar");
				cine = sc.nextInt();
				switch (cine){
					case 1:
						this.cinesLima();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 2:
						this.cinesArequipa();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 3:
						this.cinesCajamarca();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 4:
						this.cinesChiclayo();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 5:
						this.cinesCusco();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 6:
						this.cinesHuancayo();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 7:
						this.cinesHuanuco();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 8:
						this.cinesJuliaca();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 9:
						this.cinesPiura();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 10:
						this.cinesPucallpa();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 11:
						this.cinesPuno();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 12:
						this.cinesTacna();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 13:
						this.cinesTrujllo();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 0:
						this.eventos();
					default:
						this.solicitudevento();
				}
				break;
			case 5:
				evento="Congreso";
				this.ciudades();
				System.out.println("\nEscoga un cineplanet para poder reservar");
				cine = sc.nextInt();
				switch (cine){
					case 1:
						this.cinesLima();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 2:
						this.cinesArequipa();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 3:
						this.cinesCajamarca();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 4:
						this.cinesChiclayo();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 5:
						this.cinesCusco();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 6:
						this.cinesHuancayo();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 7:
						this.cinesHuanuco();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 8:
						this.cinesJuliaca();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 9:
						this.cinesPiura();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 10:
						this.cinesPucallpa();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 11:
						this.cinesPuno();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 12:
						this.cinesTacna();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 13:
						this.cinesTrujllo();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 0:
						this.eventos();
					default:
						this.solicitudevento();
				}
				break;
			case 6:
				evento="Seminario";
				this.ciudades();
				System.out.println("\nEscoga un cineplanet para poder reservar");
				cine = sc.nextInt();
				switch (cine){
					case 1:
						this.cinesLima();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 2:
						this.cinesArequipa();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 3:
						this.cinesCajamarca();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 4:
						this.cinesChiclayo();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 5:
						this.cinesCusco();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 6:
						this.cinesHuancayo();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 7:
						this.cinesHuanuco();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 8:
						this.cinesJuliaca();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 9:
						this.cinesPiura();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 10:
						this.cinesPucallpa();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 11:
						this.cinesPuno();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 12:
						this.cinesTacna();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 13:
						this.cinesTrujllo();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 0:
						this.eventos();
					default:
						this.solicitudevento();
				}
				break;
			case 7:
				evento="Lanzamiento";
				this.ciudades();
				System.out.println("\nEscoga un cineplanet para poder reservar");
				cine = sc.nextInt();
				switch (cine){
					case 1:
						this.cinesLima();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 2:
						this.cinesArequipa();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 3:
						this.cinesCajamarca();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 4:
						this.cinesChiclayo();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 5:
						this.cinesCusco();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 6:
						this.cinesHuancayo();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 7:
						this.cinesHuanuco();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 8:
						this.cinesJuliaca();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 9:
						this.cinesPiura();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 10:
						this.cinesPucallpa();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 11:
						this.cinesPuno();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 12:
						this.cinesTacna();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 13:
						this.cinesTrujllo();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 0:
						this.eventos();
					default:
						this.solicitudevento();
				}
				break;
			case 8:
				evento="Presentaciones";
				this.ciudades();
				System.out.println("\nEscoga un cineplanet para poder reservar");
				cine = sc.nextInt();
				switch (cine){
					case 1:
						this.cinesLima();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 2:
						this.cinesArequipa();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 3:
						this.cinesCajamarca();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 4:
						this.cinesChiclayo();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 5:
						this.cinesCusco();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 6:
						this.cinesHuancayo();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 7:
						this.cinesHuanuco();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 8:
						this.cinesJuliaca();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 9:
						this.cinesPiura();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 10:
						this.cinesPucallpa();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 11:
						this.cinesPuno();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 12:
						this.cinesTacna();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 13:
						this.cinesTrujllo();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 0:
						this.eventos();
					default:
						this.solicitudevento();
				}
				break;
			case 9:
				evento="Club de Fans";
				this.ciudades();
				System.out.println("\nEscoga un cineplanet para poder reservar");
				cine = sc.nextInt();
				switch (cine){
					case 1:
						this.cinesLima();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 2:
						this.cinesArequipa();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 3:
						this.cinesCajamarca();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 4:
						this.cinesChiclayo();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 5:
						this.cinesCusco();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 6:
						this.cinesHuancayo();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 7:
						this.cinesHuanuco();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 8:
						this.cinesJuliaca();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 9:
						this.cinesPiura();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 10:
						this.cinesPucallpa();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 11:
						this.cinesPuno();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 12:
						this.cinesTacna();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 13:
						this.cinesTrujllo();
						if(cine==0){
							this.solicitudevento();
						}
						else {
							this.detalles();
						}
						break;
					case 0:
						this.eventos();
					default:
						this.solicitudevento();
				}
				break;
			case 0:
				this.eventos();
				break;
			default:
			this.solicitudevento();
		}
	}
	public void detalles(){
		System.out.println("Capacidad de la sala");
		System.out.println("""
				1. Hasta 200 butacas
				2. Mas de 200 butacas
				3. Mas de 300 butacas
				4. Mas de 400 butacas
				5. Hasta 100 butacas(Prime)
				""");
		opcion= sc.nextInt();
		switch (opcion){
			case 1:
				capacidad = "Hasta 200 butacas";
				break;
			case 2:
				capacidad = "Mas de 200 butacas";
				break;
			case 3:
				capacidad = "Mas de 300 butacas";
				break;
			case 4:
				capacidad = "Mas de 400 butacas";
				break;
			case 5:
				capacidad = "Hasta 100 butacas(Prime)";
				break;
			default:
				this.detalles();
		}
		System.out.println("Cuantos combos desea adquirir:");
		comboscoorporativo = sc.nextInt();
		this.fecha();
	}
	public void fecha(){
		System.out.println("FECHA DE RESERVACION DE LA SALA");
		System.out.println("Ingrese el dia");
		dia = sc.nextInt();
		System.out.println("Ingrese el mes");
		mes = sc.nextInt();
		System.out.println("Ingrese el año");
		año = sc.nextInt();
		this.contacto();
	}
	public void contacto(){
		System.out.println("Nombre completo");
		String nombre=sc.nextLine();
		System.out.println("N° de DNI");
		String Dni= sc.nextLine();
		if(Dni.length()<8){
			System.out.println("Digitos Incorrectos");
			System.out.println("Ingrese otra vez:");
			Dni= sc.nextLine();
			if(Dni.length()<8){
				System.out.println("Digitos Incorrectos");
				System.out.println("Hasta luego.");
			}
			else{
				System.out.println("N° de RUC");
				String RUC = sc.nextLine();
				System.out.println("Correo");
				String correo= sc.nextLine();
				System.out.println("Celular");
				String celular= sc.nextLine();
				this.resumen();
			}
		}else {
			System.out.println("N° de RUC");
			String RUC = sc.nextLine();
			System.out.println("Correo");
			String correo= sc.nextLine();
			System.out.println("Celular");
			String celular= sc.nextLine();
			this.resumen();
		}

	}
	public void resumen() {
		System.out.println("Valida los datos de tu solicitud");
		System.out.println("EVENTO: " + evento + " CINES: " + cine1);
		System.out.println("CAPACIDAD: " + capacidad + " COMBOS:" + comboscoorporativo);
		System.out.println("FECHA: "+ dia +"-"+mes+"-"+año);

}
	//CONTACTANOS
	public void contactanos() {
		System.out.println("---Contactanos---");
		System.out.println("Atención de Consultas o Incidencias");
		System.out.println("Para asegurar la calidad y optimización de nuestro servicio " +
				" por favor llenar todos los campos que solicitamos.¡Gracias!");
		System.out.println("Nombre");
		String nombre = sc.next();
		System.out.println("Nombre" + nombre);
		System.out.println("Apellidos");
		String apellidos = sc.next();
		System.out.println("Apellidos" + apellidos);
		System.out.println("Eres Socio Cineplanet? (Sí/No)");
		String socio = sc.next();
		System.out.println("Socio" + socio);
		System.out.println("DNI");
		int Dni = sc.nextInt();
		System.out.println("DNI" + Dni);
		System.out.println("Teléfono de contacto");
		int telefono = sc.nextInt();
		System.out.println("Telefono" + telefono);
		System.out.println("Correo");
		String correo = sc.next();
		System.out.println("Correo" + correo);
		System.out.println("Motivo");
		System.out.println("""
				Opcion 1: ACTUALIZACION DE DATOS
				Opcion 2: COMPRA ONLINE
				Opcion 3: INCIDENCIAS EN CINES
				Opcion 4: PROGRAMA SOCIO
				Opcion 5: VENTA CORPORATIVOS
				Opcion 6: PROMOCIONES Y CAMPAÑAS
				Opcion 7: FELICITACIONES
				Opcion 8: OTROS MOTIVOS
				""");
		int opcion = sc.nextInt();
		sc.nextLine();
		switch (opcion) {
			case 1:
				System.out.println("Mensaje - Información que deseas actualizar.");
				String MensajeAct = sc.next();
				System.out.println("Mensaje" + MensajeAct);
				System.out.println("Archivos adjuntos - Para validar tus datos adjunta una" +
						"imagen de tu Documento de Identidad en formato JPG PNG o PDF.");
				String Act = sc.next();
				System.out.println("Actualizar" + Act);
				System.out.println("Pronto recibirás un correo notificando la actualizacion" +
						"de datos solicitada.");
				System.out.println("Disfruta de tus Beneficios.");
				break;
			case 2:
				System.out.println("Consulta");
				System.out.println("""
						Opcion 1: No puedo realizar compras 
						Opcion 2: Se concretó el pago y no llega la orden de compra
						""");
				System.out.println("Canal de compra");
				System.out.println("""
						Opcion 1: APP
						Opcion 2: Wed
						Opcion 3: Boletería Express(Kiosko)
						Opcion 4: Presencial
						""");
				System.out.println("Tipo de Compra");
				System.out.println("""
						Opcion 1: PayU
						Opcion 2: Billetera Electrónica(Yape/Plin/Tunki)
						Opcion 3: Agora
						Opcion 4: Boletería Express(Visa/MAstercard)
						Opcion 5: Presencial (Caja en el Cine)
						""");
				System.out.println("Cine");
				System.out.println("Mensaje - Información que deseas actualizar.");
				String MensajeOnl = sc.next();
				System.out.println("Mensaje" + MensajeOnl);
				System.out.println("Archivos adjuntos - Para validar tus datos adjunta una" +
						"imagen de tu Documento de Identidad en formato JPG PNG o PDF.");
				String Onl = sc.next();
				System.out.println("Archivos" + Onl);
				System.out.println("Pronto recibirás un correo notificando la actualizacion" +
						"de datos solicitada.");
				System.out.println("Disfruta de tus Beneficios.");
				break;
			case 3:
				System.out.println("Área");
				System.out.println("""
						Opcion 1: Boletería
						Opcion 2: Dulcería
						Opcion 3: Ingreso a salas
						Opcion 4: Salas
						Opcion 5: Baños
						Opcion 6: Otras áreas
						""");
				System.out.println("Mensaje - Información que deseas actualizar.");
				String MensajeInc = sc.next();
				System.out.println("Mensaje" + MensajeInc);
				System.out.println("Archivos adjuntos - Para validar tus datos adjunta una" +
						"imagen de tu Documento de Identidad en formato JPG PNG o PDF.");
				String Inc = sc.next();
				System.out.println("Archivos" + Inc);
				System.out.println("Pronto recibirás un correo notificando la actualizacion" +
						"de datos solicitada.");
				System.out.println("Disfruta de tus Beneficios.");
				break;
			case 4:
				System.out.println("Consulta");
				System.out.println("""
						Opcion 1: Mis Visitas y Puntos
						Opcion 2: Mi Categoría Socio
						Opcion 3: Mis Beneficios
						""");
				int opcion_soc = sc.nextInt();
				switch (opcion_soc) {
					case 1:
						System.out.println("Cine");
						System.out.println("Número de Compra");
						int numsoc = sc.nextInt();
						System.out.println("Numero" + numsoc);
						System.out.println("Mensaje - Información que deseas actualizar.");
						String Soc = sc.next();
						System.out.println("Mensaje" + Soc);
						System.out.println("Archivos adjuntos - Para validar tus datos adjunta una" +
								"imagen de tu Documento de Identidad en formato JPG PNG o PDF.");
						String ActSoc = sc.next();
						System.out.println("Archivos" + ActSoc);
						System.out.println("Pronto recibirás un correo notificando la actualizacion" +
								"de datos solicitada.");
						System.out.println("Disfruta de tus Beneficios.");
						break;
					case 2:
						System.out.println("Mensaje - Información que deseas actualizar.");
						String MensajeSoc = sc.next();
						System.out.println("Mensaje" + MensajeSoc);
						System.out.println("Archivos adjuntos - Para validar tus datos adjunta una" +
								"imagen de tu Documento de Identidad en formato JPG PNG o PDF.");
						String soc = sc.next();
						System.out.println("Archivos" + soc);
						System.out.println("Pronto recibirás un correo notificando la actualizacion" +
								"de datos solicitada.");
						System.out.println("Disfruta de tus Beneficios.");
						break;
					case 3:
						System.out.println(" Mensaje - Información que deseas actualizar.");
						String MensajeSoci = sc.next();
						System.out.println("Mensaje" + MensajeSoci);
						System.out.println("Archivos adjuntos - Para validar tus datos adjunta una" +
								"imagen de tu Documento de Identidad en formato JPG PNG o PDF.");
						String soci = sc.next();
						System.out.println("Archivos" + soci);
						System.out.println("Pronto recibirás un correo notificando la actualizacion" +
								"de datos solicitada.");
						System.out.println("Disfruta de tus Beneficios.");
						break;
					default:
						System.out.println("Opcion no valida");
						break;
				}
				break;
			case 5:
				System.out.println("Link a la sección de ventas corporativas");
				System.out.println("https://www.cineplanet.com.pe/ventas-corporativas");
				break;
			case 6:
				System.out.println(" Mensaje - Información que deseas actualizar.");
				String MensajePro = sc.next();
				System.out.println("Mensaje" + MensajePro);
				System.out.println("Archivos adjuntos - Para validar tus datos adjunta una" +
						"imagen de tu Documento de Identidad en formato JPG PNG o PDF.");
				String Pro = sc.next();
				System.out.println("Archivos" + Pro);
				System.out.println("Pronto recibirás un correo notificando la actualizacion" +
						"de datos solicitada.");
				System.out.println("Disfruta de tus Beneficios.");
				break;
			case 7:
				System.out.println("Me gustaría reconocer a ");
				System.out.println("""
						Opcion 1: Cine
						Opcion 2: Área
						Opcion 3: Persona
						""");
				System.out.println(" Mensaje - Información que deseas actualizar.");
				String MensajeFel = sc.next();
				System.out.println("Mensaje" + MensajeFel);
				System.out.println("Archivos adjuntos - Para validar tus datos adjunta una" +
						"imagen de tu Documento de Identidad en formato JPG PNG o PDF.");
				String Feli = sc.next();
				System.out.println("Archivos" + Feli);
				System.out.println("Pronto recibirás un correo notificando la actualizacion" +
						"de datos solicitada.");
				System.out.println("Disfruta de tus Beneficios.");
				break;
			case 8:
				System.out.println(" Mensaje - Información que deseas actualizar. ");
				String MensajeMot = sc.next();
				System.out.println("Mensaje" + MensajeMot);
				System.out.println("Archivos adjuntos - Para validar tus datos adjunta una" +
						"imagen de tu Documento de Identidad en formato JPG PNG o PDF.");
				String Mot = sc.next();
				System.out.println("Archivos" + Mot);
				System.out.println("Pronto recibirás un correo notificando la actualizacion" +
						"de datos solicitada.");
				System.out.println("Disfruta de tus Beneficios.");
				break;
			default:
				System.out.println("Opcion no valida");
				break;
		}
	}


	//GENERAL IOSEF
	public void ciudades(){
		System.out.println("TODAS LAS CIUDADES");
		System.out.println("1. Lima");
		System.out.println("2. Arequipá");
		System.out.println("3. Cajamarca");
		System.out.println("4. Chiclayo");
		System.out.println("5. Cusco");
		System.out.println("6. Huancayo");
		System.out.println("7. Huanuco");
		System.out.println("8. Juliaca");
		System.out.println("9. Piura");
		System.out.println("10. Pucallpa");
		System.out.println("11. Puno");
		System.out.println("12. Tacna");
		System.out.println("13. Trujillo");
		System.out.println("0. Regresar");
	}
	public void cinesLima() {
		ciudad = "Lima";
		System.out.println("""
				
					|-------------------------------|					|-------------------------------|
					|                      			|					|                      			|
					|   	  CP Alcazar (1)		|					|   		CP Brasil (2)		|
					|	 Av. Santa Cruz 814 - 816	|					|	 Av. Brasil 714 - 792		|
					|    2D, REGULAR, 3D         	|					|    2D, REGULAR, 3D         	|
					|                      			|					|                      			|
					|-------------------------------|					|-------------------------------|
				
					|-------------------------------|					|-------------------------------|
					|                      			|					|                      			|
					|    CP Caminos del Inca (3)    |					|   	CP El Polo (4)			|
					|	 Av. Inca 241 				|					|	 Av. El Polo 695			|
					|    2D, REGULAR, 3D         	|					|    2D, REGULAR, 3D         	|
					|                      			|					|                      			|
					|-------------------------------|					|-------------------------------|
				
				0. Regresar
				
				ELIJA UN CINE:	
				""");
		cine = sc.nextInt();
		switch (cine) {
			case 1:
				cine1 = "CP Alcazar";
				break;
			case 2:
				cine1 = "CP Brasil";
				break;
			case 3:
				cine1 = "CP Caminos del Inca";
				break;
			case 4:
				cine1 = "CP El Polo";
				break;
			case 0:
				break;
			default:
				this.cinesLima();
		}
	}
	public void cinesArequipa(){
		ciudad = "Arequipa";
		System.out.println("""
					
					|-------------------------------|					|-------------------------------|
					|                      			|					|                      			|
					|   CP Arequipa Mall Plaza (1)	|					|    CP Paseo Central (2)		|
					|	Av. Ejercito 814 - 816		|					|	 Av. Arturo Ibañez s/n		|
					|   2D, REGULAR, 3D         	|					|    2D, REGULAR	        	|
					|                      			|					|                      			|
					|-------------------------------|					|-------------------------------|
					
											|-------------------------------|					
											|                      			|					
											|  CP Real Plaza Arequipa (3)   |					
											|  Av. Ejercito 1009 			|					
											|  2D, REGULAR, 3D        	 	|					
											|                      			|					
											|-------------------------------|					
					
				0. Regresar
				
				ELIJA UN CINE:	
				""");
		cine = sc.nextInt();
		switch (cine) {
			case 1:
				cine1 = "CP Arequipa Mall Plaza";
				break;
			case 2:
				cine1 = "CP Paseo Central";
				break;
			case 3:
				cine1 = "CP Real Plaza Arequipa";
				break;
			case 0:
				break;
			default:
				this.cinesArequipa();
		}
	}
	public void cinesCajamarca(){
		ciudad = "Cajamarca";
		System.out.println("""
					
					
											|-------------------------------|					
											|                      			|					
											|  		CP Cajamarca (1) 		|					
											|  Av. Via de Evitamiento		|					
											|  2D, REGULAR, 3D        	 	|					
											|                      			|					
											|-------------------------------|					
					
				0. Regresar
				
				ELIJA UN CINE:	
				""");
		cine = sc.nextInt();
		switch (cine){
			case 1:
				cine1= "CP Cajamarca";
				break;
			case 0:
				break;
			default:
				this.cinesCajamarca();
		}
	}
	public void cinesChiclayo() {
		ciudad = "Chiclayo";
		System.out.println("""
					
					|-------------------------------|					|-------------------------------|
					|                      			|					|                      			|
					|   CP Chiclayo Mall Plaza (1)	|					|  CP Chiclayo Real Plaza (2)	|
					|	Av. Panamericana 814 - 816	|					|  Av. Miguel Cervantes 300		|
					|   2D, REGULAR, 3D         	|					|  2D, REGULAR, 3D	        	|
					|                      			|					|                      			|
					|-------------------------------|					|-------------------------------|
									
					
				0. Regresar
				
				ELIJA UN CINE:	
				""");
		cine = sc.nextInt();
		switch (cine){
			case 1:
				cine1= "CP Chiclayo Mall Plaza";
				break;
			case 2:
				cine1= "CP Chiclayo Real Plaza";
				break;
			case 0:
				break;
			default:
				this.cinesChiclayo();
		}
	}
	public void cinesCusco() {
		ciudad = "Cusco";
		System.out.println("""
					
					
											|-------------------------------|					
											|                      			|					
											|  			CP Cusco(1) 		|					
											|  Av. Collasuyo 2964			|					
											|  2D, REGULAR		       	 	|					
											|                      			|					
											|-------------------------------|					
					
				0. Regresar
				
				ELIJA UN CINE:	
				""");
		cine = sc.nextInt();
		switch (cine){
			case 1:
				cine1= "CP Cusco";
				break;
			case 0:
				break;
			default:
				this.cinesCusco();
		}
	}
	public void cinesHuancayo() {
		ciudad = "Huancayo";
		System.out.println("""
					
					
											|-------------------------------|					
											|                      			|					
											|  	CP Huancayo Real PLaza (1) 	|					
											|  	Av. Ferrocarril s/n			|					
											|  	2D, REGULAR, 3D        	 	|					
											|                      			|					
											|-------------------------------|					
					
				0. Regresar
				
				ELIJA UN CINE:	
				""");
		cine = sc.nextInt();
		switch (cine){
			case 1:
				cine1= "CP Huancayo Real PLaza";
				break;
			case 0:
				break;
			default:
				this.cinesHuancayo();
		}


	}
	public void cinesHuanuco() {
		ciudad = "Huanuco";
		System.out.println("""
					
					
											|-------------------------------|					
											|                      			|					
											|  	CP Huanuco Real PLaza (1) 	|					
											|  	Av. Independencia s/n		|					
											|  	2D, REGULAR, 3D        	 	|					
											|                      			|					
											|-------------------------------|					
					
				0. Regresar
				
				ELIJA UN CINE:	
				""");
		cine = sc.nextInt();
		switch (cine) {
			case 1:
				cine1 = "CP Huanuco Real PLaza";
				break;
			case 0:
				break;
			default:
				this.cinesHuanuco();
		}
	}
	public void cinesJuliaca() {
		ciudad = "Juliaca";
		System.out.println("""
					
					
											|-------------------------------|					
											|                      			|					
											|  		  CP Juliaca (1) 		|					
											|  	Calle Tumbes 395			|					
											|  	2D, REGULAR, 3D        	 	|					
											|                      			|					
											|-------------------------------|					
					
				0. Regresar
				
				ELIJA UN CINE:	
				""");
		cine = sc.nextInt();
		switch (cine){
			case 1:
				cine1= "CP Juliaca";
				break;
			case 0:
				break;
			default:
				this.cinesJuliaca();
		}
	}
	public void cinesPiura() {
		ciudad = "Piura";
		System.out.println("""
					
					|-------------------------------|					|-------------------------------|
					|                      			|					|                      			|
					|   		CP Piura(1)			|					|  	CP Piura Real Plaza (2)		|
					|	Jr. Huancavelica 537		|					|  	Av. Sanchez Cerro 234		|
					|   2D, REGULAR		        	|					|  	2D, REGULAR		        	|
					|                      			|					|                      			|
					|-------------------------------|					|-------------------------------|
									
					
				0. Regresar
				
				ELIJA UN CINE:	
				""");
		cine = sc.nextInt();
		switch (cine){
			case 1:
				cine1= "CP Piura";
				break;
			case 2:
				cine1= "CP Piura Real Plaza";
				break;
			case 0:
				break;
			default:
				this.cinesPiura();
		}


	}
	public void cinesPucallpa() {
		ciudad = "Pucallpa";
		System.out.println("""
					
					
											|-------------------------------|					
											|                      			|					
											|  		  CP Pucallpa (1) 		|					
											|  	Av.Centenario 395			|					
											|  	2D, REGULAR, 3D        	 	|					
											|                      			|					
											|-------------------------------|					
					
				0. Regresar
				
				ELIJA UN CINE:	
				""");
		cine = sc.nextInt();
		switch (cine){
			case 1:
				cine1= "CP Pucallpa";
				break;
			case 0:
				break;
			default:
				this.cinesPucallpa();
		}
	}
	public void cinesPuno() {
		ciudad = "Puno";
		System.out.println("""
					
					
											|-------------------------------|					
											|                      			|					
											|  		  	CP Puno (1) 		|					
											|  	Av.Los Incas s/n			|					
											|  	2D, REGULAR		       	 	|					
											|                      			|					
											|-------------------------------|					
					
				0. Regresar
				
				ELIJA UN CINE:	
				""");
		cine = sc.nextInt();
		switch (cine){
			case 1:
				cine1= "CP Puno";
				break;
			case 0:
				break;
			default:
				this.cinesPuno();
		}
	}
	public void cinesTacna() {
		ciudad = "Tacna";
		System.out.println("""
					
					
											|-------------------------------|					
											|                      			|					
											|  		  	CP Tacna (1) 		|					
											|  	Av.Cuzco 36					|					
											|  	2D, REGULAR, 3D	       	 	|					
											|                      			|					
											|-------------------------------|					
					
				0. Regresar
				
				ELIJA UN CINE:	
				""");
		cine = sc.nextInt();
		switch (cine){
			case 1:
				cine1= "CP Tacna";
				break;
			case 0:
				break;
			default:
				this.cinesTacna();
		}
	}
	public void cinesTrujllo() {
		ciudad = "Trujllo";
		System.out.println("""
					
					|-------------------------------|					|-------------------------------|
					|                      			|					|                      			|
					|   	CP Trujillo(1)			|					|  	CP Trujillo Real Plaza (2)	|
					|	Jr. Marisacal 537			|					|  	Av. Cesar Vallejo 1345		|
					|   2D, REGULAR		        	|					|  	2D, REGULAR, 3D	        	|
					|                      			|					|                      			|
					|-------------------------------|					|-------------------------------|
									
					
				0. Regresar
				
				ELIJA UN CINE:	
				""");
		cine = sc.nextInt();
		switch (cine){
			case 1:
				cine1= "CP Trujillo";
				break;
			case 2:
				cine1= "CP Trujillo Real Plaza";
				break;
			case 0:
				break;
			default:
				this.cinesTrujllo();
		}

	}
	public static void main(String[] args) {
		Cinep obj = new Cinep();
		obj.menuprincipal();
	}
}


