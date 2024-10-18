import java.util.Scanner;

public class Cinep {
	Scanner sc= new Scanner(System.in);
	private String pelicula, Car1;
	private double  total,igv, subtotal, vuelto, pago, resto,costo2d=10,costo3d=18, costoniños2d=8,costoviejos=8,costoniños3d=15,costoviejos3d=15,costopromo2d=8,costopromo3d=12,costosocio2d =6,costosocio3d = 12;
	private int opcion, tiempo;
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
		System.out.print("                   			1.Peliculas     ");
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
				this.Menucoorporativo();
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
	public void socio(){}
	public void asientos(){
		System.out.println("\n"+"""
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
		if (Car1.equals("")){
		}
		else{
			this.mas_asientos();
		}

	}
	public void mas_asientos(){
		System.out.println("\n¿Quiere mas asientos?");
		System.out.println("1. Si");
		System.out.println("2. No");
		opcion = sc.nextInt();
		if(opcion == 1){
			this.asientos();
		}
		else if(opcion == 2){
			this.comprar();
		}
	}
	public void comprar(){
		if (Car1.equals("")){
		}
		else{
			this.costo();
		}
	}
	public void tiempo(){
		if (tiempo ==1){
			System.out.println("""
							Usted esta comprando las siguientes butacas
							Asiento: """ + Car1 + "  "+"""
							Tiempo: 05:20 pm
							Lugar: Juliaca
							""");
		} else if (tiempo ==2) {
			System.out.println("""
							Usted esta comprando las siguientes butacas
							Asiento: """ + Car1 + "  "+"""
							Tiempo: 10:20 pm
							Lugar: Juliaca
							""");

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
		System.out.println("Eliga que entrada quiere:");
		opcion= sc.nextInt();
		switch (opcion){
			case 1:
				total = costo2d;
				this.total();
				break;
			case 2:
				total= costoviejos;
				this.total();
				break;
			case 3:
				total = costoniños2d;
				this.total();
				break;
			case 4:
				total = costo3d;
				this.total();
				break;
			case 5:
				total = costoviejos3d;
				this.total();
				break;
			case 6:
				total = costoniños3d;
				this.total();
				break;
			case 0:
				this.asientos();
				break;
		}
		return total;
	}
	public void cines(){
		int cine;
		do {
			System.out.println("""
                    Seleccionar Ciudad
                    1) Juliaca
                    2) Puno
                    3) Lima
                    4) Etc...
                    0) Regresar...
                    Ingrese una opcion:""");
			cine = sc.nextInt();
			switch (cine) {
				case 1:
					ciuJuliaca();
					break;
				case 2:
					ciuPuno();
					break;
				case 3:
					ciuLima();
					break;
				case 0:
					System.out.println("Regresando");
					this.menuprincipal();
					break;
				default:
					System.out.println("Opcion no valida.");
			}
		}while (cine!=0);
	}
	public void ciuLima() {}
	public void ciuPuno() {}
	public void ciuJuliaca() {
		int cine;
			this.peliculas();
	}
	public void peliculas() {
		int cine;
		do {
			System.out.println("""
Tenemos las siguientes peliculas:
1)El Plan Del Asesino

2)Hellboy: The Crooked Man
                    
3)La Chica del Alquile

4)My Hero Academia : Ahora es tu Turno

5)Guasón 2: Folie À Deux

6)La Sustancia

7)No Hables con Extraños

8)Robot Salvaje

9)Transformers Uno
""");
			cine = sc.nextInt();
			switch (cine) {
				case 1:
					ciuPelLima();
					break;
				case 2:
					ciuPelPuno();
					break;
				case 3:
					ciuPelJuliaca();
					break;
				case 0:
					System.out.println("Saliendo del apartado...");
					break;
				default:
					System.out.println("Opcion no valida.");
			}
		}while (cine!=0);
	}
	public void ciuPelLima() {}
	public void ciuPelPuno() {}
	public void ciuPelJuliaca() {
		int cine;
		do {
			this.peliculas();
			cine = sc.nextInt();
			switch (cine) {
				case 1:
					pelicula = "El Plan del Asesino";
					this.pelicula();
					break;
				case 2:
					break;
				case 3:
					break;
				case 0:
					System.out.println("Saliendo del apartado...");
					break;
				default:
			}
		}while (cine!=0);
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
		do {
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
			}
		} while (Car1.equals("")) ;
	}
	public void arequipaMallPlaza() {

		int cine;
		do {
			System.out.println("""
                    Peliculas de HOY !!
                    1) El Plan Del Asesino
                        Acción  2h  +14.
                        2D REGULAR DOBLADA
                        * 05:20 pm
                        * 10:20 pm
                    2) Hellboy: The Crooked Man
                        Acción  1h 40min  +14.
                        2D REGULAR DOBLADA
                        * 03:10 pm
                        * 08:00 pm
                    3) My Hero Academia : Ahora es tu Turno
                        Anime  2h  APT.
                        2D REGULAR DOBLADA
                        *02:50 pm
                        *05:10 pm
                        2D REGULAR SUBTITULADA
                        *07:30 pm
                    Ingrese una opcion:""");
			cine = sc.nextInt();
			switch (cine) {
				case 1:
					this.pelicula();
					break;
				case 2:
					break;
				default:
					System.out.println("Opcion no valida.");
					break;
			}

		}while (cine!=0);
	}
	public void contactanos(){
		System.out.println("---Contactanos---");
		System.out.println("Atención de Consultas o Incidencias");
		System.out.println("Para asegurar la calidad y optimización de nuestro servicio " +
				" por favor llenar todos los campos que solicitamos.¡Gracias!");
		System.out.println("Nombre");
		String nombre =sc.next();
		System.out.println("Apellidos");
		String apellidos=sc.next();
		System.out.println("Eres Socio Cineplanet? (Sí/No)");
		String socio=sc.next();
		System.out.println("DNI");
		int Dni=sc.nextInt();
		System.out.println("Teléfono de contacto");
		int telefono=sc.nextInt();
		System.out.println("Correo");
		String correo=sc.next();
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
		int opcion=sc.nextInt();
		sc.nextLine();
		switch (opcion){
			case 1:
				System.out.println("Mensaje - Información que deseas actualizar.");
				String MensajeAct=sc.next();
				System.out.println("Archivos adjuntos - Para validar tus datos adjunta una" +
						"imagen de tu Documento de Identidad en formato JPG PNG o PDF.");
				String Act=sc.next();
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
				String MensajeOnl=sc.next();
				System.out.println("Archivos adjuntos - Para validar tus datos adjunta una" +
						"imagen de tu Documento de Identidad en formato JPG PNG o PDF.");
				String Onl=sc.next();
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
				String MensajeInc=sc.next();
				System.out.println("Archivos adjuntos - Para validar tus datos adjunta una" +
						"imagen de tu Documento de Identidad en formato JPG PNG o PDF.");
				String Inc=sc.next();
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
				int opcion_soc=sc.nextInt();
				switch (opcion_soc){
					case 1:
						System.out.println("Cine");
						System.out.println("Número de Compra");
						int numsoc=sc.nextInt();
						System.out.println("Mensaje - Información que deseas actualizar.");
						String Soc=sc.next();
						System.out.println("Archivos adjuntos - Para validar tus datos adjunta una" +
								"imagen de tu Documento de Identidad en formato JPG PNG o PDF.");
						String ActSoc=sc.next();
						System.out.println("Pronto recibirás un correo notificando la actualizacion" +
								"de datos solicitada.");
						System.out.println("Disfruta de tus Beneficios.");
						break;
					case 2:
						System.out.println("Mensaje - Información que deseas actualizar.");
						String MensajeSoc=sc.next();
						System.out.println("Archivos adjuntos - Para validar tus datos adjunta una" +
								"imagen de tu Documento de Identidad en formato JPG PNG o PDF.");
						String soc=sc.next();
						System.out.println("Pronto recibirás un correo notificando la actualizacion" +
								"de datos solicitada.");
						System.out.println("Disfruta de tus Beneficios.");
						break;
					case 3:
						System.out.println(" Mensaje - Información que deseas actualizar.");
						String MensajeSoci=sc.next();
						System.out.println("Archivos adjuntos - Para validar tus datos adjunta una" +
								"imagen de tu Documento de Identidad en formato JPG PNG o PDF.");
						String soci=sc.next();
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
				String MensajePro=sc.next();
				System.out.println("Archivos adjuntos - Para validar tus datos adjunta una" +
						"imagen de tu Documento de Identidad en formato JPG PNG o PDF.");
				String Pro=sc.next();
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
				String MensajeFel=sc.next();
				System.out.println("Archivos adjuntos - Para validar tus datos adjunta una" +
						"imagen de tu Documento de Identidad en formato JPG PNG o PDF.");
				String Feli=sc.next();
				System.out.println("Pronto recibirás un correo notificando la actualizacion" +
						"de datos solicitada.");
				System.out.println("Disfruta de tus Beneficios.");
				break;
			case 8:
				System.out.println(" Mensaje - Información que deseas actualizar. ");
				String MensajeMot=sc.next();
				System.out.println("Archivos adjuntos - Para validar tus datos adjunta una" +
						"imagen de tu Documento de Identidad en formato JPG PNG o PDF.");
				String Mot=sc.next();
				System.out.println("Pronto recibirás un correo notificando la actualizacion" +
						"de datos solicitada.");
				System.out.println("Disfruta de tus Beneficios.");
				break;
			default:
				System.out.println("Opcion no valida");
				break;
		}
	}
	public void coorporativo(){
		System.out.println("---Corporativo---");
		System.out.println("Conoce nuestros productos");
		System.out.println("Seleccione el producto de su interes");
		System.out.println("Opcion 1: Funciones especiales");
		System.out.println("Opcion 2: Alquiler de salas");
		System.out.println("Opcion 3: Entradas y Combos");
		System.out.println("Opcion 4: At Work");
		System.out.println("Opcion 5: Publicidad");
		System.out.println("Opcion 6: Planet Fiesta");
		int opcion=sc.nextInt();
		sc.nextLine();
		switch(opcion){
			case 1:
				System.out.println("Seleccione la funcion especial");
				System.out.println("""
                        Opcion 1: Corporativa
                        Opcion 2: Institucional
                        """);
				int opcion_esp=sc.nextInt();
				switch(opcion_esp){
					case 1:
						System.out.println("Nombre completo");
						String nombre=sc.next();
						System.out.println("Nombre:"+ nombre);
						System.out.println("N° de DNI");
						int Dni= sc.nextInt();
						System.out.println("Dni:"+ Dni);
						System.out.println("Correo");
						String correo= sc.next();
						System.out.println("Correo:"+ correo);
						System.out.println("Telefono");
						int telefono= sc.nextInt();
						System.out.println("Telefono:"+telefono);
						System.out.println("Cine");
						System.out.println("""
                                Opcion 1:
                                """);
						System.out.println("Pelicula");
						String pelicula=sc.next();
						System.out.println("Pelicula:"+ pelicula);
						System.out.println("Fecha de la función");
						int fecha=sc.nextInt();
						System.out.println("Fecha:"+ fecha);
						System.out.println("Horario-" +
								"Preferible ingresar un horario mayor a 9:00 y menor a 11.00");
						int horario= sc.nextInt();
						System.out.println("Horario:"+ horario);
						System.out.println("Cantidad de invitados");
						int cant_corp= sc.nextInt();
						System.out.println("Cantidad:"+ cant_corp);
						System.out.println("Cantidad de combos");
						int cant_cor=sc.nextInt();
						System.out.println("Cantidad:"+ cant_cor);
						break;
					case 2:
						System.out.println("Nombre  completo");
						String nombre_ins=sc.next();
						System.out.println("Nombre:"+ nombre_ins);
						System.out.println("N° de DNI");
						int Dni_ins= sc.nextInt();
						System.out.println("Dni:"+ Dni_ins);
						System.out.println("Correo");
						String correo_ins= sc.next();
						System.out.println("Correo:"+ correo_ins);
						System.out.println("Telefono");
						int telefono_ins= sc.nextInt();
						System.out.println("Telefono:"+ telefono_ins);
						System.out.println("Cine");
						System.out.println("Pelicula");
						String pelicula_ins=sc.next();
						System.out.println("Pelicula:"+ pelicula_ins);
						System.out.println("Fecha de la función");
						int fecha_ins=sc.nextInt();
						System.out.println("Fecha:"+ fecha_ins);
						System.out.println("Horario-" +
								"Preferible ingresar un horario mayor a 9:00 y menor a 11.00");
						int horario_ins= sc.nextInt();
						System.out.println("Horario:"+ horario_ins);
						System.out.println("Cantidad de invitados");
						int cant_corp_ins= sc.nextInt();
						System.out.println("Invitados:"+ cant_corp_ins);
						System.out.println("Cantidad de combos");
						int cant_ins=sc.nextInt();
						System.out.println("Combos:"+ cant_ins);
						break;
					default:
						System.out.println("Opcion no valida");
						break;
				}
				break;
			case 2://alquiler de salas

				System.out.println("Nombre completo");
				String nombre_alq=sc.next();
				System.out.println("Nombre:" +nombre_alq);
				System.out.println("N° de DNI");
				int Dni_alq= sc.nextInt();
				System.out.println("Dni:" + Dni_alq);
				System.out.println("Correo");
				String correo_alq= sc.next();
				System.out.println("Correo:" +correo_alq);
				System.out.println("Telefono");
				int telefono_alq= sc.nextInt();
				System.out.println("Telefono:" + telefono_alq);
				System.out.println("Cine");
				System.out.println("Cantidad de invitados");
				int cant_alq= sc.nextInt();
				System.out.println("Invitados:" + cant_alq);
				System.out.println("Fecha de la función");
				int fecha_alq=sc.nextInt();
				System.out.println("Fecha:" + fecha_alq);
				System.out.println("Horario-" +
						"Preferible ingresar un horario mayor a 9:00 y menor a 11.00");
				int horario_alq= sc.nextInt();
				System.out.println("Horario:" + horario_alq);
				break;
			case 3://entradas y combos

				System.out.println("Nombre  completo");
				String nombre_com=sc.next();
				System.out.println("Nombre:"+ nombre_com);
				System.out.println("N° de DNI");
				int Dni_com= sc.nextInt();
				System.out.println("Dni:" + Dni_com);
				System.out.println("Correo");
				String correo_com= sc.next();
				System.out.println("Correo:" +correo_com);
				System.out.println("Telefono");
				int telefono_com= sc.nextInt();
				System.out.println("Telefono:" + telefono_com);
				System.out.println("Cantidad de entradas");
				int cant_corp_com= sc.nextInt();
				System.out.println("Invitados:"+ cant_corp_com);
				System.out.println("Cantidad de combos");
				int cant_com=sc.nextInt();
				System.out.println("Combos:"+ cant_com);

				break;
			case 4: //at work

				System.out.println("Nombre  completo");
				String nombre_at=sc.next();
				System.out.println("Nombre:"+ nombre_at);
				System.out.println("N° de DNI");
				int Dni_at= sc.nextInt();
				System.out.println("Dni:" + Dni_at);
				System.out.println("Correo");
				String correo_at= sc.next();
				System.out.println("Correo:" +correo_at);
				System.out.println("Telefono");
				int telefono_at= sc.nextInt();
				System.out.println("Telefono:" + telefono_at);
				System.out.println("Razon social");
				String cine_at=sc.next();
				System.out.println("Razón social:" + cine_at);
				System.out.println("RUC");
				String pelicula_at=sc.next();
				System.out.println("RUC:" + pelicula_at);
				System.out.println("Dirección de la empresa");
				String fecha_at=sc.next();
				System.out.println("Dirección:" + fecha_at);
				System.out.println("Cantidad de colaboradores");
				int cant_at=sc.nextInt();
				System.out.println("Colaboradores:" + cant_at);

				break;
			case 5: //publicidad
				System.out.println("Seleccione el tipo de publicidad");
				System.out.println("""
                        Opcion 1: Publicidad en pantallas
                        Opcion 2: Publicidad en lobbies
                        Opcion 3: Publicidad en elementos corpóreos
                        """);
				int opcion_publi= sc.nextInt();
				switch (opcion_publi){
					case 1:
						System.out.println("Nombre  completo");
						String nombre_publi=sc.next();
						System.out.println("Nombre:"+ nombre_publi);
						System.out.println("N° de DNI");
						int Dni_publi= sc.nextInt();
						System.out.println("Dni:" + Dni_publi);
						System.out.println("Correo");
						String correo_publi= sc.next();
						System.out.println("Correo:" +correo_publi);
						System.out.println("Telefono");
						int telefono_publi= sc.nextInt();
						System.out.println("Telefono:" + telefono_publi);
						System.out.println("Razon social");
						String razon_publi=sc.next();
						System.out.println("Razón social:" + razon_publi);
						System.out.println("RUC");
						String RUC_publi=sc.next();
						System.out.println("RUC:" + RUC_publi);
						System.out.println("Direccion de la empresa");
						String direccion_publi=sc.next();
						System.out.println("Dirección:" + direccion_publi);
						System.out.println("Cines de interes");
						String cine_publi=sc.next();
						System.out.println("Cines de interes:" + cine_publi);
						System.out.println("Duración de publicidad");
						double dura_publi= sc.nextLong();
						System.out.println("Duración de publicidad:" + dura_publi);
						System.out.println("Tiempo al aire");
						String tiempo_publi= sc.next();
						System.out.println("Tiempo al aire:" + tiempo_publi);
						break;
					case 2:

						System.out.println("Nombre completo ");
						String nombre_lob=sc.next();
						System.out.println("Nombre:"+ nombre_lob);
						System.out.println("N° de DNI");
						int Dni_lob= sc.nextInt();
						System.out.println("Dni:" + Dni_lob);
						System.out.println("Correo");
						String correo_lob= sc.next();
						System.out.println("Correo:" +correo_lob);
						System.out.println("Telefono");
						int telefono_lob= sc.nextInt();
						System.out.println("Telefono:" + telefono_lob);
						System.out.println("Razon social");
						String razon_lob=sc.next();
						System.out.println("Razón social:" + razon_lob);
						System.out.println("RUC");
						String RUC_lob=sc.next();
						System.out.println("RUC:" + RUC_lob);
						System.out.println("Direccion de la empresa");
						String direccion_lob=sc.next();
						System.out.println("Dirección:" + direccion_lob);
						System.out.println("Cines de interes");
						String cine_lob=sc.next();
						System.out.println("Cines de interes:" + cine_lob);
						System.out.println("duración de publicidad");
						double dura_lob= sc.nextLong();
						System.out.println("Duración de publicidad:" + dura_lob);
						System.out.println("Tiempo al aire");
						String tiempo_lob= sc.next();
						System.out.println("Tiempo al aire:" + tiempo_lob);
						break;
					case 3:
						System.out.println("Nombre completo");
						String nombre_ele=sc.next();
						System.out.println("Nombre:"+ nombre_ele);
						System.out.println("N° de DNI");
						int Dni_ele= sc.nextInt();
						System.out.println("Dni:" + Dni_ele);
						System.out.println("Correo");
						String correo_ele= sc.next();
						System.out.println("Correo:" +correo_ele);
						System.out.println("Telefono");
						int telefono_ele= sc.nextInt();
						System.out.println("Telefono:" + telefono_ele);
						System.out.println("Razon social");
						String razon_ele=sc.next();
						System.out.println("Razón social:" + razon_ele);
						System.out.println("RUC");
						String RUC_ele=sc.next();
						System.out.println("RUC:" + RUC_ele);
						System.out.println("Direccion de la empresa");
						String direccion_ele=sc.next();
						System.out.println("Dirección:" + direccion_ele);
						System.out.println("Cines de interes");
						String cine_ele=sc.next();
						System.out.println("Cines de interes:" + cine_ele);
						System.out.println("duración de publicidad");
						double dura_ele= sc.nextLong();
						System.out.println("Duración de publicidad:" + dura_ele);
						System.out.println("Tiempo al aire");
						String tiempo_ele= sc.next();
						System.out.println("Tiempo al aire:" + tiempo_ele);

				}
				break;
			case 6: // planet fiesta
				System.out.println("Nombre  completo");
				String nombre_pla=sc.next();
				System.out.println("Nombre:"+ nombre_pla);
				System.out.println("N° de DNI");
				int Dni_pla= sc.nextInt();
				System.out.println("Dni:" + Dni_pla);
				System.out.println("Correo");
				String correo_pla= sc.next();
				System.out.println("Correo:" +correo_pla);
				System.out.println("Telefono");
				int telefono_pla= sc.nextInt();
				System.out.println("Telefono:" + telefono_pla);
				System.out.println("Cine");
				System.out.println("Pelicula");
				String pelicula_pla=sc.next();
				System.out.println("Pelicula:" + pelicula_pla);
				System.out.println("Fecha del evento");
				int fecha_pla=sc.nextInt();
				System.out.println("Fecha:" + fecha_pla);
				System.out.println("Horario-" +
						"Preferible ingresar un horario mayor a 9:00 y menor a 11.00");
				int horario_pla= sc.nextInt();
				System.out.println("Horario:" + horario_pla);
				System.out.println("Cantidad de invitados");
				int cant_pla= sc.nextInt();
				System.out.println("Invitados:" + cant_pla);
				break;
			default:
				System.out.println("No es valida esa opcion");
				break;
		}
	}
	public void recogerDatosPublicitario(){
		System.out.println("Nombre completo");
		String nombre = sc.next();
		System.out.println("Nombre: " + nombre);

	}
	public void Menucoorporativo() {
		int opcion_publi;

		do {
			System.out.println("Seleccione una opción:");
			System.out.println("1. Opción 1 (Publicidad)");
			System.out.println("2. Opción 2 (Publicidad)");
			System.out.println("3. Opción 3 (Publicidad)");
			System.out.println("6. Planet Fiesta");
			System.out.println("0. Salir");
			opcion_publi = sc.nextInt();

			switch (opcion_publi) {
				case 1:
				case 2:
				case 3:
					recogerDatosPublicitario1();
					break;
				case 6:
					recogerDatosEvento();
					break;
				case 0:
					System.out.println("Saliendo del programa...");
					break;
				default:
					System.out.println("No es válida esa opción, intente de nuevo.");
					break;
			}
		} while (opcion_publi != 0);
	}
	public void recogerDatosPublicitario1() {
		System.out.println("Nombre completo:");
		String nombre_publi = sc.next();
		System.out.println("Nombre: " + nombre_publi);

		System.out.println("N° de DNI:");
		int dni_publi = sc.nextInt();
		System.out.println("DNI: " + dni_publi);

		System.out.println("Correo:");
		String correo_publi = sc.next();
		System.out.println("Correo: " + correo_publi);

		System.out.println("Teléfono:");
		int telefono_publi = sc.nextInt();
		System.out.println("Teléfono: " + telefono_publi);

		System.out.println("Razón social:");
		String razon_publi = sc.next();
		System.out.println("Razón social: " + razon_publi);

		System.out.println("RUC:");
		String ruc_publi = sc.next();
		System.out.println("RUC: " + ruc_publi);

		System.out.println("Dirección de la empresa:");
		String direccion_publi = sc.next();
		System.out.println("Dirección: " + direccion_publi);

		System.out.println("Cines de interés:");
		String cine_publi = sc.next();
		System.out.println("Cines de interés: " + cine_publi);

		System.out.println("Duración de publicidad:");
		double dura_publi = sc.nextDouble();
		System.out.println("Duración de publicidad: " + dura_publi);

		System.out.println("Tiempo al aire:");
		String tiempo_publi = sc.next();
		System.out.println("Tiempo al aire: " + tiempo_publi);
	}
	public void recogerDatosEvento() {
		System.out.println("Nombre completo:");
		String nombre_pla = sc.next();
		System.out.println("Nombre: " + nombre_pla);

		System.out.println("N° de DNI:");
		int dni_pla = sc.nextInt();
		System.out.println("DNI: " + dni_pla);

		System.out.println("Correo:");
		String correo_pla = sc.next();
		System.out.println("Correo: " + correo_pla);

		System.out.println("Teléfono:");
		int telefono_pla = sc.nextInt();
		System.out.println("Teléfono: " + telefono_pla);

		System.out.println("Película:");
		String pelicula_pla = sc.next();
		System.out.println("Película: " + pelicula_pla);

		System.out.println("Fecha del evento:");
		String fecha_pla = sc.next(); // Cambiado a String para permitir formatos de fecha
		System.out.println("Fecha: " + fecha_pla);

		System.out.println("Horario (Preferible ingresar un horario mayor a 9:00 y menor a 11.00):");
		int horario_pla = sc.nextInt();
		System.out.println("Horario: " + horario_pla);

		System.out.println("Cantidad de invitados:");
		int cant_pla = sc.nextInt();
		System.out.println("Invitados: " + cant_pla);
	}
	public void promociones(){
		Scanner scanner = new Scanner(System.in);
		String[] productos = {"Popcorn", "Gaseosa", "Nachos", "Caramelos", "Hot Dog"};
		double[] precios = {12.50, 7.00, 10.00, 5.50, 8.00};
		System.out.println("---- Dulcería Cineplanet Juliaca ----");
		System.out.println("Productos disponibles:");
		for (int i = 0; i < productos.length; i++) {
			System.out.println((i + 1) + ". " + productos[i] + " - S/ " + precios[i]);
		}
		int[] cantidades = new int[productos.length];
		for (int i = 0; i < productos.length; i++) {
			System.out.print("Ingrese la cantidad de " + productos[i] + " que desea comprar: ");
			cantidades[i] = scanner.nextInt();
		}
		double totalSinPromocion = 0;
		System.out.println("\nResumen de compra:");
		for (int i = 0; i < productos.length; i++) {
			if (cantidades[i] > 0) {
				double subtotal = cantidades[i] * precios[i];
				System.out.println(productos[i] + " x " + cantidades[i] + " = S/ " + subtotal);
				totalSinPromocion += subtotal;
			}
		}
		double descuento = 0;
		System.out.print("\nIngrese el día de la semana (Lunes, Martes, etc.): ");
		String diaSemana = scanner.next().toLowerCase();
		switch (diaSemana) {
			case "lunes":
				System.out.println("Promoción Lunes: 20% de descuento en toda la compra.");
				descuento = totalSinPromocion * 0.20;
				break;
			case "miércoles":
				System.out.println("Promoción Miércoles: 2x1 en Popcorn.");
				if (cantidades[0] >= 2) {
					descuento = precios[0];
				}
				break;
			case "viernes":
				System.out.println("Promoción Viernes: 15% de descuento si el total supera S/ 50.");
				if (totalSinPromocion > 50) {
					descuento = totalSinPromocion * 0.15;
				}
				break;
			default:
				System.out.println("No hay promociones disponibles para este día.");
		}
		double totalConPromocion = totalSinPromocion - descuento;
		System.out.println("\nTotal sin descuento: S/ " + totalSinPromocion);
		System.out.println("Descuento aplicado: S/ " + descuento);
		System.out.println("Total a pagar: S/ " + totalConPromocion);
		System.out.println("\n¡Gracias por su compra en Cineplanet Juliaca!");
	}
	public void dulceria(){
		Scanner scanner = new Scanner(System.in);
		String[] productos = {"Popcorn", "Gaseosa", "Nachos", "Caramelos", "Hot Dog"};
		double[] precios = {12.50, 7.00, 10.00, 5.50, 8.00};
		System.out.println("---- Dulcería Cineplanet Juliaca ----");
		System.out.println("Productos disponibles:");
		for (int i = 0; i < productos.length; i++) {
			System.out.println((i + 1) + ". " + productos[i] + " - S/ " + precios[i]);
		}
		int[] cantidades = new int[productos.length];
		for (int i = 0; i < productos.length; i++) {
			System.out.print("Ingrese la cantidad de " + productos[i] + " que desea comprar: ");
			cantidades[i] = scanner.nextInt();
		}
		double total = 0;
		System.out.println("\nResumen de compra:");
		for (int i = 0; i < productos.length; i++) {
			if (cantidades[i] > 0) {
				double subtotal = cantidades[i] * precios[i];
				System.out.println(productos[i] + " x " + cantidades[i] + " = S/ " + subtotal);
				total += subtotal;
			}
		}
		System.out.println("\nTotal a pagar: S/ " + total);
		System.out.println("\n¡Gracias por su compra en Cineplanet Juliaca!");
	}
	public static void main(String[] args) {
		Cinep obj = new Cinep();
		obj.menuprincipal();
	}
}