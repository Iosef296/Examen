import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ConcesionarioIosef {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    String departamento,letras,placa="",sedefinal="",nombres,dni ,correo,telefono,tarjeta,codigo_nuevo;
    int opcion,i,numero,cantidad,vehiculo,opcion_sede,cantidadPlacas=20,numeros,cotizar=0,codigo=0;
    double totalcamionetas,totaldeportivos,totalseminuevos, igv,subtotal, total,pago,cantidadvehiculos;
    ArrayList<Integer> compra_camioneta = new ArrayList<>();
    ArrayList<Integer> compra_deportivo = new ArrayList<>();
    ArrayList<Integer> compra_seminuevo = new ArrayList<>();
    ArrayList<Double> subtotal_camioneta = new ArrayList<>();
    ArrayList<Double> subtotal_deportivo = new ArrayList<>();
    ArrayList<Double> subtotal_seminuevo = new ArrayList<>();
    ArrayList<String> camionetas = new ArrayList<>();
    ArrayList<Double> precioscamionetas = new ArrayList<>();
    ArrayList<String> deportivos = new ArrayList<>();
    ArrayList<Double> preciosdeportivos = new ArrayList<>();
    ArrayList<String> seminuevos = new ArrayList<>();
    ArrayList<Double> preciosseminuevos = new ArrayList<>();
    String[] departamentos = {"Amazonas", "Áncash", "Apurímac", "Arequipa", "Ayacucho", "Cajamarca", "Callao", "Cusco", "Huancavelica", "Huánuco", "Ica", "Junín", "La Libertad", "Lambayeque", "Lima", "Loreto", "Madre de Dios", "Moquegua", "Pasco", "Piura", "Puno", "San Martín", "Tacna", "Tumbes", "Ucayali"};
    String[] sedes = {"Sede Arequipa", "Sede Chincha", "Sede Cusco", "Sede Ica", "Sede Juliaca", "Sede Piura", "Sede Puno", "Sede Trujillo"};
    String[] camioneta = {"Wrangler - Jeep (SUV)", "Cherokee - Jeep (SUV)" , "Altima - Nissan (SUV en algunos modelos)" , "Outlander - Mitsubishi (SUV)" , "Land Cruiser - Toyota (SUV)" , "Explorer - Ford (SUV)" , "X5 - BMW (SUV)" , "Soul - Kia (SUV compacto)" , "Siena - Toyota (SUV/Minivan)" , "Tucson - Hyundai (SUV)" , "Tundra - Toyota (Pick-up)" , "Wrangler Unlimited - Jeep (SUV)" , "Range Rover - Land Rover (SUV)" , "Pacifica - Chrysler (SUV/Minivan)" , "Mokka - Opel (SUV)" , "Q5 - Audi (SUV)"};
    String[] deportivo = {"Mustang - Ford (Deportivo)" , "Camaro - Chevrolet (Deportivo)" , "Model S - Tesla (Deportivo, aunque es eléctrico)" , "Vantage - Aston Martin (Deportivo)" , "Civic Type R - Honda (Deportivo compacto)" , "Cayenne - Porsche (Deportivo / SUV de alto rendimiento)" , "3 Series - BMW (Deportivo)" , "C-Class - Mercedes-Benz (Deportivo / Sedan deportivo)" , "Golf - Volkswagen (Deportivo en algunas versiones como el GTI)" , "A4 - Audi (Deportivo / Sedan)" , "Q7 - Audi (SUV deportivo)" , "E-Class - Mercedes-Benz (Deportivo / Sedan)" , "F-150 - Ford"};
    String[] seminuevo = {"Honda Civic (2017)" , "Toyota Corolla (2016)" , "Ford Mustang (2015)" , "Chevrolet Camaro (2016)" , "BMW 3 Series (2014)" , "Audi A4 (2017)" , "Hyundai Elantra (2016)" , "Mazda CX-5 (2015)" , "Jeep Grand Cherokee (2016)" , "Nissan Altima (2017)" , "Subaru Impreza (2015)" , "Volkswagen Golf (2017)" , "Kia Optima (2016)" , "Ford Explorer (2016)" , "Toyota Camry (2017)" , "Chevrolet Silverado 1500 (2014)" , "Ram 1500 (2015)" , "Honda Accord (2014)" , "Audi Q5 (2015)" , "Mazda 6 (2014)"};
    double[] precioscamioneta = {35000, 28000, 20000, 22000, 75000, 30000, 45000, 18000, 30000, 24000, 40000, 40000, 80000, 35000, 20000, 40000};
    double[] preciosdeportivo = {70000, 70000, 10000, 150000, 45000, 100000, 60000, 80000, 45000, 60000, 75000, 90000, 60000};
    double[] preciosseminuevo = {12000, 10000, 18000, 20000, 15000, 20000, 10000, 14000, 22000, 12000, 12000, 16000, 12000, 20000, 18000, 22000, 18000, 12000, 20000, 12000};
    Map<String, String> departamentoSede = new HashMap<>();
    Map<String, String> carrosMarcas = new HashMap<>();
    ArrayList<String> placas = new ArrayList<>();
    public ConcesionarioIosef() {
        //SEDES
        departamentoSede.put("Amazonas", "Sede Trujillo");
        departamentoSede.put("Ancash", "Sede Trujillo");
        departamentoSede.put("Apurímac", "Sede Cusco");
        departamentoSede.put("Arequipa", "Sede Arequipa");
        departamentoSede.put("Ayacucho", "Sede Cusco");
        departamentoSede.put("Cajamarca", "Sede Trujillo");
        departamentoSede.put("Callao", "Sede Ica");
        departamentoSede.put("Cusco", "Sede Cusco");
        departamentoSede.put("Huancavelica", "Sede Ica");
        departamentoSede.put("Huanuco", "Sede Trujillo");
        departamentoSede.put("Ica", "Sede Ica");
        departamentoSede.put("Junin", "Sede Ica");
        departamentoSede.put("La Libertad", "Sede Trujillo");
        departamentoSede.put("Lambayeque", "Sede Piura");
        departamentoSede.put("Lima", "Sede Ica");
        departamentoSede.put("Loreto", "Sede Trujillo");
        departamentoSede.put("Madre de Dios", "Sede Cusco");
        departamentoSede.put("Moquegua", "Sede Arequipa");
        departamentoSede.put("Pasco", "Sede Ica");
        departamentoSede.put("Piura", "Sede Piura");
        departamentoSede.put("Puno", "Sede Puno");
        departamentoSede.put("San Martin", "Sede Trujillo");
        departamentoSede.put("Tacna", "Sede Arequipa");
        departamentoSede.put("Tumbes", "Sede Piura");
        departamentoSede.put("Ucayali", "Sede Trujillo");
        //CARROS
        carrosMarcas.put("Civic", "Honda");
        carrosMarcas.put("Accord", "Honda");
        carrosMarcas.put("Civic Type R", "Honda");
        carrosMarcas.put("Corolla", "Toyota");
        carrosMarcas.put("Land Cruiser", "Toyota");
        carrosMarcas.put("Avalon", "Toyota");
        carrosMarcas.put("Tundra", "Toyota");
        carrosMarcas.put("Camry", "Toyota");
        carrosMarcas.put("Siena", "Toyota");
        carrosMarcas.put("Mustang", "Ford");
        carrosMarcas.put("F-150", "Ford");
        carrosMarcas.put("Explorer", "Ford");
        carrosMarcas.put("Wrangler", "Jeep");
        carrosMarcas.put("Altima", "Nissan");
        carrosMarcas.put("Sentra", "Nissan");
        carrosMarcas.put("A4", "Audi");
        carrosMarcas.put("3 Series", "BMW");
        carrosMarcas.put("C-Class", "Mercedes-Benz");
        carrosMarcas.put("Golf", "Volkswagen");
        carrosMarcas.put("CX-5", "Mazda");
        carrosMarcas.put("Outlander", "Mitsubishi");
        carrosMarcas.put("Impreza", "Subaru");
        carrosMarcas.put("Pajero", "Mitsubishi");
        carrosMarcas.put("Challenger", "Dodge");
        carrosMarcas.put("Vantage", "Aston Martin");
        carrosMarcas.put("Qashqai", "Nissan");
        carrosMarcas.put("Rio", "Kia");
        carrosMarcas.put("Sonata", "Hyundai");
        carrosMarcas.put("Discovery", "Land Rover");
        carrosMarcas.put("X5", "BMW");
        carrosMarcas.put("Q7", "Audi");
        carrosMarcas.put("E-Class", "Mercedes-Benz");
        carrosMarcas.put("Soul", "Kia");
        carrosMarcas.put("Elantra", "Hyundai");
        carrosMarcas.put("S-Class", "Mercedes-Benz");
        carrosMarcas.put("Cherokee", "Jeep");
        carrosMarcas.put("Forte", "Kia");
        carrosMarcas.put("Wrangler Unlimited", "Jeep");
        carrosMarcas.put("Tucson", "Hyundai");
        carrosMarcas.put("Mokka", "Opel");
        carrosMarcas.put("Range Rover", "Land Rover");
        carrosMarcas.put("Pacifica", "Chrysler");
        carrosMarcas.put("Cayenne", "Porsche");
        carrosMarcas.put("A3", "Audi");
        carrosMarcas.put("Q5", "Audi");
        carrosMarcas.put("Model S", "Tesla");
        carrosMarcas.put("Camaro", "Chevrolet");
        //DATOS EXTRA
        for (String elemento : camioneta) {
            camionetas.add(elemento);
        }
        for (double num : precioscamioneta) {
            precioscamionetas.add(num);
        }
        for (String elemento : deportivo) {
            deportivos.add(elemento);
        }
        for (double num : preciosdeportivo) {
            preciosdeportivos.add(num);
        }
        for (String elemento : seminuevo) {
            seminuevos.add(elemento);
        }
        for (double num : preciosseminuevo) {
            preciosseminuevos.add(num);
        }
        for (int i = 0; i < camionetas.size(); i++) {
            compra_camioneta.add(0);
            subtotal_camioneta.add(0.0);
        }
        for (int i = 0; i < deportivos.size(); i++) {
            compra_deportivo.add(0);
            subtotal_deportivo.add(0.0);
        }
        for (int i = 0; i < seminuevos.size(); i++) {
            compra_seminuevo.add(0);
            subtotal_seminuevo.add(0.0);
        }
    }
    public void menuPrincipal() {
        System.out.println("""
                                                                @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@:
                                                                @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@:
                                                                @@@@@@@@@@@@@@@@@@@@@@@@@@@@   :       =@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@:
                                                                @@@@@@@@@@@@@@@@@@@@@@@@@  @@-@@@@@@@@@@@@@@@@+@@  @@@@@@@  @@@@@@@@@@@@@:
                                                                @@@@@@@@@@@@@@@@@@@@@@@ @@ @@@@              #@@@ @@  @@@ @@  @@@@@@@@@@@:
                                                                @@@@@@@@@@@@@@@@@@@@@ =@ @@*   @@@@@@@@@@@@@@-   @@@@@ @@  @  @@@@@@@@@@@:
                                                                @@@@@@@@@@@@@@@@@@@@ @ @@   @@@              @@@   @@ @ @@@@@@@@@@@@@@@@@:
                                                                @@@@@@@@@@@@@@@@@@  @@@.  @@   @@@@@@@@@@@@@@   @@   @=@.=@@@@@@@@@@@@@@@:
                                                                @@@@@@@@@@@@@@@@@@ @@@  @@=  @@@ @@@@@@@@-@@@@@  @@@  @@@-@@       @@@@@@:
                                                                @@@@@@@@@@@@@@@@  @@@  @@  @@@@            @@@@@@  @@  @ @ @@@@@@@@@    @:
                                                                @@@@@@@@@@@@@@@@ @@  @@  @@ @@  @@@@@@@@@@  @@@@@ @@  @@ @@@@@@@@@@@@@@@@:
                                                                @@@@@@@@@@@@@@@@ @@  @@ @@@@@ @@@@@@@@@@@@@@ @@@@  @@ ,@ @ @@@@@@@@@@@@@@:
                                                                @@@@@@@@@@@@@@@@ @@=  @ @@@@                   @@@@  @@  @@@ @@@:*@###@@@#
                                                                @@@@@@@@@@@@@@@@ @@@@%@ @@@  @@@@@@@@@@@@@@@@   @@@ @@@@@@@ @@@@@@@@@@@@@*
                                                                @@@@@@@@@@@@@@@@ @@@  @  @@@     @@@@@@@@@@    @@@ @@@  @@@ @@@*+-=+*-+-%.
                                                                @@@@@@@@@@@@@@@@@ @@  @@  @@ @@@           @@@ @@  @@ @@  @@ @@@%@@@@@@@@*
                                                                @@@@@@@@@@@@@@@@@ @@@  @@  @@   @@@@@@@@@@@@   @@  @@  @=@ @@@@@@@@@@@@@@#
                                                                @@@@@@@@@@@@@@@@@# @@@  @@  @@@@@@@@@@@@@@=@@@@  @@@  @@ @ @@@@@@@%*-:.+#-
                                                                @@@@@@@@@@@@@@@@@@  @@@  @@@   @@@@@  @@@@@@    @@   @@ @ @@@@@@@@@@@@@@@+
                                                                @@@@@@@@@@@@@@@@@@@  @@@@  @@@%    +-        @@@@  @@ @  @         %@@@@@:
                                                                @@@@@@@@@@@@@@@@@@@@@ @@@@@   @@@@@#  -@@@@@@@   @@*:@ @@@@@@@@@@@@@@@@@@=
                                                                @@@@@@@@@@@@@@@@@@@@@@  @@@@@@    #@@@@@@     @@@@:@ #@@@@@@@@#@@@@@@@@@@*
                                                                @@@@@@@@@@@@@@@@@@@@@@@@@  @@@@@@@@@ @@-@@@@@@@@@  @@@@@@@@@@@%@@@@@@@@@@+
                                                                @@@@@@@@@@@@@@%#@#%#@@@@@@@*   @@@@@@@@@@@@@    @@@@@@@@@@@@@@@@@@@@@@@@@:
                                                                @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  @@@@@@    @@@@@@@@@@@@@%@@@@@@@@@@@@@@@=
                                                                @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%@@@@@@@@@@@@@@@=
                                                                @@@@@@   @@@@@@@       @@@@@@@         @@@@@         @@@@@@         @@@@@=
                                                                @@@@@@   @@@@@@  @@@@@  @@@@@   @@@@@@@@@@@@   @@@@@@@@@@@@   @@@@@@@@@@@=
                                                                @@@@@@   @@@@@   @@@@@   @@@@@         @@@@@         @@@@@@        @@@@@@
                                                                @@@@@@   @@@@@%  @@@@@  @@@@@@@@@@@@@  @@@@@   @@@@@@@@@@@@   @@@@@@@@@@@*
                                                                @@@@@@   @@@@@@@       @@@@@@         @@@@@@         @@@@@@   @@@@@@@@@@@=
                                                                @@@@@@@@@@@@@@@@@@@@@@@@@@@@%#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@:
                """);
        System.out.println("1.Nuestros Locales          2.Camionetas         3.Deportivos          4.Seminuevos            5.Servicio PostVenta         6.Cotizar                0.Salir");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                this.sedes();
                break;
            case 2:
                this.camionetas();
                break;
            case 3:
                this.deportivos();
                break;
            case 4:
                this.seminuevos();
                break;
            case 5:
                this.postventa();
                break;
            case 6:
                this.cotizar();
                break;
            case 0:
                System.out.println("Saliendo del programa.");
                break;
            default:
                this.menuPrincipal();
        }
    }
    public void sedes_1(){
        System.out.println("Tenemos las siguientes sedes 1");
        for(String sede:sedes){
            i++;
            System.out.println(i+ ". " +sede);
        }
        System.out.println("9.Elegir por ubicacion");
        System.out.println("Elija una sede:");
        opcion_sede=sc.nextInt();
        opcion_sede= opcion_sede -1;
        switch (opcion_sede) {
            case 0, 1, 2, 3,4, 5, 6, 7:
                sedefinal= sedes[opcion_sede];
                this.boleta();
                break;
            case 8:
                sedefinal="";
                this.locales_1();
                break;
            default:
        }
    }
    public void sedes(){
        System.out.println("Tenemos las siguientes sedes");
        for(String sede:sedes){
            i++;
            System.out.println(i+ ". " +sede);
        }
        System.out.println("9.Elegir por ubicacion");
        System.out.println("Elija una sede:");
        opcion_sede=sc.nextInt();
        opcion_sede= opcion_sede -1;
        switch (opcion_sede) {
            case 0, 1, 2, 3,4, 5, 6, 7:
                sedefinal= sedes[opcion_sede];
                System.out.println("¿Que tipo de vehiculo desea comprar?");
                System.out.println("1. Camionetas");
                System.out.println("2. Deportivos");
                System.out.println("3. Seminuevos");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        this.camionetas();
                        break;
                    case 2:
                        this.deportivos();
                        break;
                    case 3:
                        this.seminuevos();
                        break;
                    default:
                        System.out.println("Regresando al MenuPrincipal");
                        this.menuPrincipal();
                }
                break;
            case 8:
                sedefinal= "";
                this.locales();
                break;
            default:
        }
    }
    public void locales_1(){
        sc.nextLine();
        System.out.println("Elija el departamento para ver la sede mas cercana");
        for (String depa : departamentos) {
            System.out.println("*. " + depa);
        }
        departamento = sc.nextLine();
        System.out.println("Departamento: " + departamento + " -> Sede más cercana: " + departamentoSede.get(departamento));
        sedefinal= departamentoSede.get(departamento);
        this.boleta();
    }
    public void locales() {
        sc.nextLine();
        System.out.println("Elija el departamento para ver la sede mas cercana");
        for (String depa : departamentos) {
            System.out.println("*. " + depa);
        }
        departamento = sc.nextLine();
        System.out.println("Departamento: " + departamento + " -> Sede más cercana: " + departamentoSede.get(departamento));
        sedefinal= departamentoSede.get(departamento);
        System.out.println("¿Que tipo de vehiculo desea comprar?");
        System.out.println("1. Camionetas");
        System.out.println("2. Deportivos");
        System.out.println("3. Seminuevos");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                this.camionetas();
                break;
            case 2:
                this.deportivos();
                break;
            case 3:
                this.seminuevos();
                break;
            default:
                System.out.println("Regresando al MenuPrincipal");
                this.menuPrincipal();
        }

    }
    public void camionetas() {
        numero=0;
        for (String camioneta : camionetas) {
            System.out.println((numero + 1) + "." + camioneta);
            System.out.println(precioscamionetas.get(numero));
            numero++;
            System.out.println();
        }
        System.out.println("Elija el vehiculo a comprar:");
        vehiculo = sc.nextInt();
        cantidad = 1;
        sc.nextLine();
        if (vehiculo <= 16 && vehiculo > 0) {
            compra_camioneta.set(vehiculo - 1, compra_camioneta.get(vehiculo - 1) + cantidad);
            System.out.println("Ud ha elegido " + compra_camioneta.get(vehiculo - 1)+ " "+ camionetas.get(vehiculo-1) + "con un precio de : " + precioscamionetas.get(vehiculo - 1));
            subtotal_camioneta.set(vehiculo - 1, compra_camioneta.get(vehiculo - 1) * precioscamionetas.get(vehiculo - 1));
            System.out.println("¿Desea comprar más camionetas? \n 1. SI\n 2. NO  \n 3. Menu Principal");
            opcion = sc.nextInt();
            if (opcion == 1) {
                System.out.println("Volviendo a la sección de camionetas");
                this.camionetas();
            } else if (opcion == 2) {
                if(sedefinal=="") {
                    this.sedes_1();
                }
                else  {
                    this.boleta();
                }
            } else if (opcion == 3) {
                this.menuPrincipal();
            } else {
                System.out.println("Opcion no válida, regresando al menu principal");
                this.menuPrincipal();
            }
        }
        else{
            System.out.println("Rango invalido");
            this.camionetas();
        }
    }
    public void deportivos() {
        numero=0;
        for (String depor: deportivo) {
            System.out.println((numero+1)+ "." +depor);
            System.out.println(preciosdeportivos.get(numero));
            numero++;
            System.out.println();
        }
        System.out.println("Elija el vehiculo a comprar:");
        vehiculo =sc.nextInt();
        cantidad = 1;
        sc.nextLine();
        if(vehiculo<=14&&vehiculo>0) {
            compra_deportivo.set(vehiculo - 1, compra_deportivo.get(vehiculo - 1) + cantidad);
            System.out.println("Ud ha elegido " + deportivos.get(vehiculo - 1)+ "con un precio de : " + preciosdeportivos.get(vehiculo - 1));
            subtotal_deportivo.set(vehiculo - 1, compra_deportivo.get(vehiculo - 1) * preciosdeportivos.get(vehiculo - 1));
            System.out.println("¿Desea comprar más autos deportivos? \n 1. SI\n 2. NO  \n 3. Menu Principal");
            opcion = sc.nextInt();
            if (opcion == 1) {
                System.out.println("Volviendo a la sección de deportivos");
                this.camionetas();
            } else if (opcion == 2) {
                this.sedes_1();
            } else if (opcion == 3) {
                this.menuPrincipal();
            } else {
                System.out.println("Opcion no válida, regresando al menu principal");
                this.menuPrincipal();
            }
        }
        else{
            System.out.println("Rango invalido");
            this.deportivos();
        }
    }
    public void seminuevos() {
        numero=0;
        for (String semi: seminuevos) {
            System.out.println((numero+1)+ "." +semi);
            System.out.println(preciosseminuevos.get(numero));
            numero++;
            System.out.println();
        }
        System.out.println("Elija el vehiculo a comprar:");
        vehiculo =sc.nextInt();
        cantidad = 1;
        sc.nextLine();
        if(vehiculo<=20&&vehiculo>0) {
            compra_seminuevo.set(vehiculo - 1, compra_seminuevo.get(vehiculo - 1) + cantidad);
            System.out.println("Ud ha elegido " + seminuevos.get(vehiculo - 1)+ "con un precio de : " + preciosseminuevos.get(vehiculo - 1));
            subtotal_seminuevo.set(vehiculo - 1, compra_seminuevo.get(vehiculo - 1) * preciosseminuevos.get(vehiculo - 1));
            System.out.println("¿Desea comprar más vehiculos seminuevos? \n 1. SI\n 2. NO  \n 3. Menu Principal");
            opcion = sc.nextInt();
            if (opcion == 1) {
                System.out.println("Volviendo a la sección de vehiculos seminuevos");
                this.camionetas();
            } else if (opcion == 2) {
                this.sedes_1();
            } else if (opcion == 3) {
                this.menuPrincipal();
            } else {
                System.out.println("Opcion no válida, regresando al menu principal");
                this.menuPrincipal();
            }
        }
        else{
            System.out.println("Rango invalido");
            this.seminuevos();
        }
    }
    public void postventa() {
        sc.nextLine();
        System.out.println("Ingrese el codigo de su boleta para acceder a este apartado");
        codigo_nuevo=sc.nextLine();
        if(codigo_nuevo.equals(codigo)){
            for (int i = 0; i < camionetas.size(); i++) {
                int cantidad = compra_camioneta.get(i);
                if (cantidad > 0) {
                    System.out.println("Bienvenidos a post-venta");
                    System.out.println("Su vehiculo es un: " + camionetas.get(i));
                    }
                }
            for (int i = 0; i < deportivos.size(); i++) {
                int cantidad = compra_deportivo.get(i);
                if (cantidad > 0) {
                    System.out.println("Bienvenidos a post-venta");
                    System.out.println("Su vehiculo es un: " + deportivos.get(i));
                    }
                }

            for (int i = 0; i < seminuevos.size(); i++) {
                int cantidad = compra_seminuevo.get(i);
                if (cantidad > 0) {
                    System.out.println("Bienvenidos a post-venta");
                    System.out.println("Su vehiculo es un: " + seminuevos.get(i));
                }
            }
        }
        else{
            System.out.println("Codigo invalido");
            this.menuPrincipal();
        }
    }
    public void cotizar() {
        System.out.println("¿Que tipo de vehiculo desea cotizar?");
        System.out.println("1. Camionetas");
        System.out.println("2. Deportivos");
        System.out.println("3. Seminuevos");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                this.camionetas();
                break;
            case 2:
                this.deportivos();
                break;
            case 3:
                this.seminuevos();
                break;
            default:
                System.out.println("Regresando al menu principal");
                this.menuPrincipal();
        }
        this.datos();
        System.out.println("""
                @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
                @@@@@@   @@@@@@@       @@@@@@@         @@@@@         @@@@@@         @@@@
                @@@@@@   @@@@@@  @@@@@  @@@@@   @@@@@@@@@@@@   @@@@@@@@@@@@   @@@@@@@@@@
                @@@@@@   @@@@@   @@@@@   @@@@@         @@@@@         @@@@@@        @@@@@
                @@@@@@   @@@@@%  @@@@@  @@@@@@@@@@@@@  @@@@@   @@@@@@@@@@@@   @@@@@@@@@@
                @@@@@@   @@@@@@@       @@@@@@         @@@@@@         @@@@@@   @@@@@@@@@@
                @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
                """);
        System.out.println("\t\t\t--------- COTIZACION ---------     ");
        cotizar=1;
        this.contenido();
    }
    public void contenido(){
        cantidadvehiculos = 0;
        this.placa();
        System.out.println("\t\t\tRUC: 20768778081 - SEDE:" + sedefinal);
        System.out.println("\t\t\tNOMBRES Y APELLIDOS: "+nombres);
        System.out.println("\t\t\tDNI: "+dni);
        System.out.println("\t\t\tCORREO: "+correo);
        System.out.println("\t\t\tTELEFONO: "+telefono);
        System.out.println("\t\t\tTARJETA: "+tarjeta);
        if(cotizar==0) {
            System.out.println("CANTIDAD\tVEHICULO\t\t\t\t\t\t\t\tPLACA\t\t\tTOTAL\n");
        }else if (cotizar==1) {
            System.out.println("CANTIDAD\tVEHICULO\t\t\t\t\t\t\t\tTOTAL\n");
        }
        //VENTA CAMIONETAS
        for (int i = 0; i < camionetas.size(); i++) {
            int cantidad = compra_camioneta.get(i);
            if (cantidad > 0) {
                if(cotizar==0) {
                    totalcamionetas = subtotal_camioneta.get(i);
                    System.out.printf("%d\t\t\t%s\t\t\t\t\t%s\t\t\t%.2f\n", cantidad, camionetas.get(i), placas.get(i), totalcamionetas);
                    cantidadvehiculos += totalcamionetas;
                }
                else if (cotizar==1) {
                    totalcamionetas = subtotal_camioneta.get(i);
                    System.out.printf("%d\t\t\t%s\t\t\t\t\t%.2f\n", cantidad, camionetas.get(i), totalcamionetas);
                    cantidadvehiculos += totalcamionetas;
                }
            }
        }
        for (int i = 0; i < deportivos.size(); i++) {
            int cantidad = compra_deportivo.get(i);
            if (cantidad > 0) {
                if(cotizar==0) {
                    totaldeportivos = subtotal_deportivo.get(i);
                    System.out.printf("%d\t\t\t%s\t\t\t\t\t%s\t\t\t%.2f\n", cantidad, deportivos.get(i),placas.get(i), totaldeportivos);
                    cantidadvehiculos += totaldeportivos;
                }
                else if (cotizar==1) {
                    totaldeportivos = subtotal_deportivo.get(i);
                    System.out.printf("%d\t\t\t%s\t\t\t\t\t%.2f\n", cantidad, deportivos.get(i), totaldeportivos);
                    cantidadvehiculos += totaldeportivos;
                }
            }
        }
        for (int i = 0; i < seminuevos.size(); i++) {
            int cantidad = compra_seminuevo.get(i);
            if (cantidad > 0) {
                if(cotizar==0) {
                    totalseminuevos = subtotal_seminuevo.get(i);
                    System.out.printf("%d\t\t\t%s\t\t\t\t\t%s\t\t\t%.2f\n", cantidad, seminuevos.get(i),placas.get(i), totalseminuevos);
                    cantidadvehiculos += totalseminuevos;}
                else if (cotizar==1) {
                    totalseminuevos = subtotal_seminuevo.get(i);
                    System.out.printf("%d\t\t\t%s\t\t\t\t\t%.2f\n", cantidad, seminuevos.get(i), totalseminuevos);
                    cantidadvehiculos += totalseminuevos;
                }
            }
        }
        igv = cantidadvehiculos * 0.18;
        subtotal= cantidadvehiculos-igv;
        pago = subtotal + igv;
        System.out.printf("\nSUBTOTAL: %.2f\n", subtotal);
        System.out.printf("IGV: %.2f\n", igv);
        System.out.printf("TOTAL A PAGAR: %.2f\n", pago);
        System.out.println("GRACIAS POR SU COMPRA");
        this.imprimir_boleta();
        System.out.println("¿Regresar al menu principal?");
        System.out.println("1.Si");
        System.out.println("2.No");
        opcion= sc.nextInt();
        switch (opcion) {
            case 1:
                this.menuPrincipal();
                break;
            case 2:
                break;
        }
    }
    public void datos(){
        sc.nextLine();
        System.out.println("Ingrese sus nombres y apellidos");
        nombres = sc.nextLine();
        while (true) {
            System.out.println("Ingrese su DNI");
            dni = sc.nextLine();
            if (dni.length()==8) {
                break;
            } else {
                System.out.println("DNI inválido. Debe contener exactamente 8 dígitos.");
            }
        }
        while (true) {
            System.out.println("Ingrese su correo");
            correo = sc.nextLine();
            if (correo.contains("@")) {
                break;
            } else {
                System.out.println("Correo invalido.");
            }
        }
        while (true) {
            System.out.println("Ingrese su telefono");
            telefono = sc.nextLine();
            if (telefono.length()==9) {
                break;
            } else {
                System.out.println("Telefono invalido.");
            }
        }
        while (true) {
            System.out.println("Ingrese su tarjeta");
            tarjeta = sc.nextLine();
            if (tarjeta.length()==16) {
                break;
            } else {
                System.out.println("Tarjeta invalida.");
            }
        }
    }
    public void boleta(){
        this.datos();
        System.out.println("""
                @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
                @@@@@@   @@@@@@@       @@@@@@@         @@@@@         @@@@@@         @@@@
                @@@@@@   @@@@@@  @@@@@  @@@@@   @@@@@@@@@@@@   @@@@@@@@@@@@   @@@@@@@@@@
                @@@@@@   @@@@@   @@@@@   @@@@@         @@@@@         @@@@@@        @@@@@
                @@@@@@   @@@@@%  @@@@@  @@@@@@@@@@@@@  @@@@@   @@@@@@@@@@@@   @@@@@@@@@@
                @@@@@@   @@@@@@@       @@@@@@         @@@@@@         @@@@@@   @@@@@@@@@@
                @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
                """);
        System.out.println("\t\t\t--------- BOLETA DE VENTA ---------     ");
        this.contenido();

    }
    public void imprimir_boleta(){
        codigo = random.nextInt(9000) + 1000;
        try (FileWriter fileWriter = new FileWriter("boleta.txt")) {
            fileWriter.write("""
                @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
                @@@@@@   @@@@@@@       @@@@@@@         @@@@@         @@@@@@         @@@@
                @@@@@@   @@@@@@  @@@@@  @@@@@   @@@@@@@@@@@@   @@@@@@@@@@@@   @@@@@@@@@@
                @@@@@@   @@@@@   @@@@@   @@@@@         @@@@@         @@@@@@        @@@@@
                @@@@@@   @@@@@%  @@@@@  @@@@@@@@@@@@@  @@@@@   @@@@@@@@@@@@   @@@@@@@@@@
                @@@@@@   @@@@@@@       @@@@@@         @@@@@@         @@@@@@   @@@@@@@@@@
                @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
                        """);
            fileWriter.write("\t\t\t--------- BOLETA DE VENTA ---------     \n");
            fileWriter.write("\t\t\tRUC: 20768778081 - SEDE:" + sedefinal +"\n");
            fileWriter.write("\t\t\tNOMBRES Y APELLIDOS:     \n"+nombres +"\n");
            fileWriter.write("\t\t\tDNI: "+dni +"\n");
            fileWriter.write("\t\t\tCORREO: "+correo +"\n");
            fileWriter.write("\t\t\tTELEFONO: "+telefono +"\n");
            fileWriter.write("\t\t\tTARJETA: "+tarjeta+"\n");
            fileWriter.write("CANTIDAD\tVEHICULO\t\t\t\t\t\t\t\tPLACA\t\t\tTOTAL\n");
            for (int i = 0; i < compra_camioneta.size(); i++) {
                int cantidad = compra_camioneta.get(i);
                if (cantidad > 0) {
                    double totalcamionetas = cantidad * subtotal_camioneta.get(i);
                    fileWriter.write(String.format("%d\t\t\t%s\t\t\t\t\t%s\t\t\t%.2f\n", cantidad, camionetas.get(i), placas.get(i), totalcamionetas));
                }
            }
            for (int i = 0; i < compra_deportivo.size(); i++) {
                int cantidad = compra_deportivo.get(i);
                if (cantidad > 0) {
                    double totaldeportivos = cantidad * subtotal_deportivo.get(i);
                    fileWriter.write(String.format("%d\t\t\t%s\t\t\t\t\t%s\t\t\t%.2f\n", cantidad, deportivos.get(i), placas.get(i), totaldeportivos));
                }
            }
            for (int i = 0; i < compra_seminuevo.size(); i++) {
                int cantidad = compra_seminuevo.get(i);
                if (cantidad > 0) {
                    double totalvehiculos = cantidad * subtotal_seminuevo.get(i);
                    fileWriter.write(String.format("%d\t\t\t%s\t\t\t\t\t%s\t\t\t%.2f\n", cantidad, seminuevos.get(i), placas.get(i), totalvehiculos));
                }
            }
            fileWriter.write(String.format("\n\t\t\t\tSUBTOTAL:     %.2f\n", subtotal));
            fileWriter.write(String.format("\t\t\t       %s\t\t%.2f\n","IGV:", igv));
            fileWriter.write(String.format("\t\t\t   TOTAL A PAGAR: %.2f\n", total));
            fileWriter.write("CODIGO UNICO DE VENTA: "+ codigo);
            System.out.println("La boleta ha sido guardada en 'boleta.txt'.");

        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir la boleta: " + e.getMessage());
        }
    }
    public void placa() {
        while (placas.size() < cantidadPlacas) {
            letras = "";
            for (int i = 0; i < 3; i++) {
                char letra = (char) ('A' + random.nextInt(26)); // Letras de A a Z
                letras += letra;
            }
            numeros = random.nextInt(900) + 100;
            placa = letras + "-" + numeros;
            placas.add(placa);
        }
    }
    public static void main(String[] args) {
        ConcesionarioIosef concesionarioIosef = new ConcesionarioIosef();
        concesionarioIosef.menuPrincipal();
    }
}






