package info_compras;
import java.sql.*;
import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.*;

public class Info_Compras {    
    //Variables globales
    private static Connection myConn;
    static Statement myStmt;
    static ResultSet myRs;
    static Exception Error;
    static String user;
    static int intentos;
    static float carrito; 
    static float yo [][]= new float [15][4];
    static int entrada;
    static int fin;
    static int star;
    static String hola;
    public static void main(String[] args) {   
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido a Jugos Apfel \n");

        programa:
        try{
            //Connect to database   
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/productos?autoReconnect=true&useSSL=false" ,"demo" ,"1234"); //Dirección de la base de datos, usuario y contraseña
            //Create a statement
            myStmt= myConn.createStatement();
            while(intentos<1){ 
                while(entrada==0){
                        logInUser();
                    }
                while (fin!=2){
                    mostrar();
                    meter();
                    agregar();
                } 
                menu();
                System.out.println("Su total a pagar es: " + recibo());
                System.out.println("¿Desea modificarlo?");
                sino();
                int last= teclado.nextInt();
                if(last==1){
                    modificar();
                }
            break programa;  
            }
        }
        catch(Exception exc){
            exc.printStackTrace();
        }
        System.out.println("Usted va a pagar : "+ recibo());
        System.out.println("Gracias por la preferencia");
        archivo();
    }
   
    public static void mostrar(){
        Scanner teclado= new Scanner(System.in);
        System.out.println("¿Como desea ver el menu?");
        System.out.println("\t 1.- Producto");
        System.out.println("\t 2.- Precio");
        System.out.println("\t 3.- Categoría");
        System.out.println("\t 4.- Estrellas");
        System.out.println("\t 5.- Descuento");
        System.out.println("\t 6.- ID");
        System.out.print("Su elección es :\t");
        int OPC = teclado.nextInt();
        switch(OPC){
            case 1:
                producto();
                break;
            case 2:
                precio();
                break;
            case 3:
                categoria();
                break;
            case 4:
                estrella();
                break;
            case 5:
                descuento();
                break;
            case 6:
                ID();
                break;
            default:
                System.out.println("La opción es incorrecta");
                mostrar();
                break;
        }
    }
    
    //Display info
    public static void producto(){
        try{
            myRs = myStmt.executeQuery("select * from productos ORDER BY Producto ASC");
            System.out.format("%20s%10s%10s%3s%10s%7s","Producto","Categoria","Estrellas","ID","Descuento","Precio");
            System.out.println("");
            while (myRs.next()){
                star= myRs.getInt("Estrellas");
                System.out.format("%20s%10s%10s%3s%10s%7s",
                                   myRs.getString("Producto"), //20 
                                   myRs.getString("Categoría"), //10
                                   myRs.getString("Estrellas"), //10
                                   myRs.getString("ID"),//3
                                   myRs.getString("Descuento"), //10
                                   myRs.getString("Precio"));//7
                System.out.println("");
            }
        }
        catch(Exception exc){
            exc.printStackTrace();
        } 
    } //todos bien
    public static void categoria(){
        try{
            myRs = myStmt.executeQuery("select * from productos ORDER BY Categoría DESC");
            System.out.format("%10s%20s%10s%3s%10s%7s","Categoria","Producto","Estrellas","ID","Descuento","Precio");
            System.out.println("");
            while (myRs.next()){
                System.out.format("%10s%20s%10s%3s%10s%7s",
                                   myRs.getString("Categoría"),
                                   myRs.getString("Producto"),        
                                   myRs.getString("Estrellas"), 
                                   myRs.getString("ID"),
                                   myRs.getString("Descuento"),
                                   myRs.getString("Precio"));
                System.out.println("");
            }
        }
        catch(Exception exc){
            exc.printStackTrace();
        } 
    } //todos bien
    public static void estrella(){
        try{
            myRs = myStmt.executeQuery("select * from productos ORDER BY Estrellas DESC");
            System.out.format("%10s%20s%10s%3s%10s%7s","Estrellas","Producto","Categoria","ID","Descuento","Precio");
            System.out.println("");
            while (myRs.next()){
                System.out.format("%10s%20s%10s%3s%10s%7s",
                                   myRs.getString("Estrellas"),
                                   myRs.getString("Producto"),
                                   myRs.getString("Categoría"),
                                   myRs.getString("ID"),
                                   myRs.getString("Descuento"),
                                   myRs.getString("Precio"));
                System.out.println("");
            }
        }
        catch(Exception exc){
            exc.printStackTrace();
        } 
    } //todos bien
    public static void ID(){
        try{
            myRs = myStmt.executeQuery("select * from productos ORDER BY ID ASC");
            System.out.format("%3s%20s%10s%10s%10s%7s","ID","Producto","Categoria","Estrellas","Descuento","Precio");
            System.out.println("");
            while (myRs.next()){
                System.out.format("%3s%20s%10s%10s%10s%7s",
                                   myRs.getString("ID"),
                                   myRs.getString("Producto"),
                                   myRs.getString("Categoría"),
                                   myRs.getString("Estrellas"), 
                                   myRs.getString("Descuento"),
                                   myRs.getString("Precio"));
                System.out.println("");
            }
        }
        catch(Exception exc){
            exc.printStackTrace();
        } 
    } //todos bien
    public static void descuento(){
        try{
            myRs = myStmt.executeQuery("select * from productos ORDER BY Descuento DESC");
            System.out.format("%10s%7s%20s%10s%10s%3s","Descuento","Precio","Producto","Categoria","Estrellas","ID");
            System.out.println("");
            while (myRs.next()){
                System.out.format("%10s%7s%20s%10s%10s%3s",
                                   myRs.getString("Descuento"),
                                   myRs.getString("Precio"),
                                   myRs.getString("Producto"),
                                   myRs.getString("Categoría"),
                                   myRs.getString("Estrellas"),
                                   myRs.getString("ID"));
                System.out.println("");
            }
        }
        catch(Exception exc){
            exc.printStackTrace();
        } 
    } //todos bien
    public static void precio(){
        try{
            System.out.format("%7s%10s%20s%10s%10s%3s","Precio","Descuento","Producto","Categoria","Estrellas","ID");
            System.out.println("");
            myRs = myStmt.executeQuery("select * from productos ORDER BY Precio ASC");
            while (myRs.next()){
                System.out.format("%7s%10s%20s%10s%10s%3s",
                                   myRs.getString("Precio"),
                                   myRs.getString("Descuento"),
                                   myRs.getString("Producto"),
                                   myRs.getString("Categoría"),
                                   myRs.getString("Estrellas"), 
                                   myRs.getString("ID"));
                System.out.println("");
            }
        }
        catch(Exception exc){
            exc.printStackTrace();
        } 
    } //todos bien
  
    public static void logInUser(){ 
        Scanner teclado= new Scanner(System.in);
        try{
            System.out.println("Ingresa tu usuario");
            user= teclado.next();
            //Ejecute SQL query
            myRs = myStmt.executeQuery ("SELECT count(*) as exist FROM `usuarios` WHERE `Usario` = '"+ user +"'"); 
            while(myRs.next()){
                int exist= myRs.getInt("exist");
                if (exist==1){
                    logInPassword();
                }
                if (exist==0){
                    System.out.println("Usuario inexistente");
                    createUser();
                } 
            }  
        }
        catch(Exception exc){
            exc.printStackTrace();
        }
    } 
    public static void logInPassword(){
        Scanner teclado= new Scanner(System.in);
        pass:
        try{
            System.out.println("Ingresa tu NIP");
            String password = teclado.next();
            String encrypt= classMD5.getMD5(password);
            myStmt= myConn.createStatement();
            myRs = myStmt.executeQuery ("SELECT count(*) as exist FROM `usuarios` WHERE usario = '"+user+"' AND `Contraseña` = '"+ encrypt +"'"); //verifica que exista el usuario
            while(myRs.next()){
                int exist=myRs.getInt("exist");
                
                switch(exist){
                    case 0:
                        System.out.println("La contraseña es incorrecta"); //al final de los tres intentos me vuelve a preguntar usuario
                        while(intentos<3 && entrada!=1){
                            if (intentos==2 ){
                                System.out.println("Has cometido tres errores, el programa se cerrará");
                                createUser();
                                System.exit(fin);
                            }
                            intentos++;
                            logInPassword();
                        }
                        break;
                    default:
                        System.out.println("Acceso completo");
                        entrada=1; //Para que me deje de preguntar la contraseña
                        break pass; //Rompe con mi try, se pudo haber usado un return;
                }  
            }        
        }
        catch(Exception exc){
            exc.printStackTrace();
        }
    } //bien
    
    public static void createUser(){
        Scanner teclado= new Scanner(System.in);
        System.out.println("¿Desea crear un usuario?");
        sino();
        int opc= teclado.nextInt();
        if (opc==2){
                    System.out.println("");
            return;
        }
        System.out.println("Ingresa tu usuario");
        user= teclado.next();
        
        try{
            //Create a statement
            myStmt= myConn.createStatement();
            String sql = "insert into usuarios (Usario, Contraseña)" + "values ('"+user+"','0')" ;
             //INSERT INTO `usuarios` (`Usario`, `Contraseña`) VALUES ('Daniela', '9874');
            myStmt.executeUpdate(sql);
            System.out.println("El usuario ha sido añadido");
            changePassword(user);
        }
        catch(Exception exc){
            exc.printStackTrace();
        }
    }//Cambiar datos acceso 
    public static void changePassword(String user){
        Scanner teclado= new Scanner(System.in);
        System.out.println("La constraseña tiene que ser un número de 4 dígitos");
        System.out.println("Ingresa nuevo NIP");
        String NIP= teclado.next();
        System.out.print("Confirma: ");
        String NIP2= teclado.next();
        int length = String.valueOf(NIP).length();
        if (length!=4){
            System.out.println("Tu contraseña no tiene 4 dígitos");
            System.out.println("Vuelve a intentarlo");
            changePassword(user);
        }

        if(!(NIP.equals(NIP2))){ //Constraseñas no coinciden
            System.out.println("Las contraseñas no coinciden");
            System.out.println("Vuelve a intentarlo");
            changePassword(user);
        }
        String enc= classMD5.getMD5(NIP); //Me convierte lo que me dio el usuario en una clave MD5
        
        try{
            //Create a statement
            myStmt= myConn.createStatement();
            String sql = "update usuarios set Contraseña= '"+enc+"' where usuarios.Usario like '" + user+"'" ;
            //UPDATE `usuarios` SET `Contraseña` = '9874' WHERE `usuarios`.`Usario` = 'lia';
            myStmt.executeUpdate(sql);
            System.out.println("La contraseña se ha modificado");
        }
        catch(Exception exc){
            exc.printStackTrace();
        }
    } //Cambiar datos acceso 
    
    public static void meter(){
        Scanner teclado= new Scanner(System.in);
        try{
            System.out.println("¿Qué producto le gustaría ordenar?");
            System.out.println("Sólo especifique el sabor");
            String pedido= teclado.next(); //error de longitud
            if(pedido.matches("jugo")){
                System.out.println("\nSOLO EL SABOR \n");
                meter();
                return;
            }
            error(pedido);
            //Ejecute SQL query            
            myRs = myStmt.executeQuery ("SELECT Precio,ID,Descuento FROM productos WHERE Producto LIKE '%"+ pedido +"%'"); 
            while(myRs.next()){
                float precio=myRs.getInt("Precio");//Esto me da el precio
                int ID= myRs.getInt("ID"); //esto me da el ID
                float off= myRs.getInt("Descuento"); //Descuento
                yo [ID][0]= ID;
                yo [ID][1]= precio;
                yo [ID][2]= (100-off)/100; 
                modificar(ID, precio);
            }   
        }
        catch(Exception exc){
            exc.printStackTrace();
        }
    }
    public static void modificar(int ID, float precio){ //funcina
        Scanner teclado= new Scanner(System.in);
        System.out.println("¿Cuál es la cantidad?"); 
        float cantidad= teclado.nextInt();
        yo [ID][3]= cantidad;
    } //modificar cantidad Si hay dos métodos con el el mismo nombre se le llama sobrecarga
    public static void modificar(){
        Scanner teclado= new Scanner(System.in);
        System.out.println("¿Qué producto quiere modificar?");
        System.out.println("");
        producto();
        int ID=0;
        try{
            System.out.println("Sólo especifique el sabor");
            String pedido= teclado.next();
            error(pedido);
            //Ejecute SQL query
            myRs = myStmt.executeQuery ("SELECT ID FROM productos WHERE Producto LIKE '%"+ pedido +"%'"); 
            while(myRs.next()){
                ID=myRs.getInt("ID");//Esto me da el valor
            }
            System.out.println("¿Cuál es la cantidad?"); 
            float cantidad= teclado.nextInt();
            yo [ID][3]= cantidad;
        }
        catch(Exception exc){
            exc.printStackTrace();
        }
    } // modificar final
    public static float recibo(){
        carrito=0;
        for( int D=0;D<yo.length;D++){
                   carrito= (yo[D][1]*yo[D][2]*yo[D][3])+carrito;                       
        }
        return carrito;
    } //me da las cuentas
    
    public static void error(String pedido){
        try{
            myRs = myStmt.executeQuery ("SELECT count(*) as error FROM productos WHERE Producto LIKE '%"+ pedido +"%'"); 
            while(myRs.next()){
                int error=myRs.getInt("error");
                if(error==0){
                    System.out.println("El producto no existe");
                    System.out.println("Intente de nuevo");
                    System.out.println("");
                    mostrar();
                    meter();
                }
            }
        }
        catch (Exception e){
            
        }
    }
    public static void agregar(){
        Scanner teclado= new Scanner(System.in);
        System.out.println("\n¿Desea ordenar algo más?");
        sino();
        fin= teclado.nextInt();
        if (fin!=1 && fin!=2){
            System.out.println("Sólo se puede 1 y 2");
            agregar();
        }
    }
    
    public static void archivo(){
        // Obtener fecha
        SimpleDateFormat formato= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date fecha = new Date();
        System.out.println(formato.format(fecha));
        
        //Crear txt
        try{
            //String x = ("Pedido_"+user+"_"+formato.format(fecha));
            
            File archivo = new File("C:\\Users\\jorge\\OneDrive\\Escritorio\\recibo.txt");
            FileWriter tinta= new FileWriter(archivo);
            BufferedWriter writer= new BufferedWriter(tinta); // Meter el archivo a la memoria
            
            writer.write("La orden de "+ user.toUpperCase());
            writer.newLine();
            writer.write("ID    ");
            writer.write("Cantidad   ");
            writer.newLine();
            for (int i=1;i<yo.length; i++){
                if (yo[i][3]!=0){
                    writer.write(yo[i][0]+ "   ");
                    writer.write(yo[i][3]+ "");
                    writer.newLine();
                }
                else{            
                }
            }
            writer.write("Usuario "+ user.toUpperCase()+ " su total es "+ carrito);
            writer.newLine();
            writer.write("Su pedido se está procesando, debe ser entregado en 30 min. o es gratis");
            writer.newLine();
            writer.write( formato.format(fecha));
            writer.flush();
            tinta.close(); 
            
            System.out.println("Tu orden está hecha");
        }
        catch(Exception exc){
            System.out.println("Su orden no fue hecha");
        }
    } //Crea un archivo  de texto con el recivo, me dijo el profe que no era necesario entonces no sé si lo haga funcionar
    public static String estrellas(int star){
        for (int a=1; a<=star; a++)
            System.out.print("*");
        
        return hola;
    } //no se incluye
    public static void sino(){
        System.out.println("\t 1.- Si");
        System.out.println("\t 2.- No");    
    } //Muestra si o no
    public static void menu(){
        System.out.format("%4s%10s","ID","Cantidad");
        System.out.println("");
        for (int i=1;i<yo.length; i++){
                if (yo[i][3]!=0){
                    
                    System.out.format("%4s%10s",yo[i][0],yo[i][3]);
                    System.out.println("");
                }
                else{            
                }
            }
    }
}
