
package lab4p1_halmarordonez;
import java.util.Scanner;

public class Lab4P1_HalmarOrdonez {


    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        char continuar = 's';
        while(continuar=='s' || continuar=='S'){
            System.out.println("----------Menu----------");
            System.out.println("1. Inversion especial");
            System.out.println("2. Balanza de cadenas");
            System.out.println("3. Cifrado de mensajes");
            System.out.println("4. Salir del programa");
            System.out.print("Ingrese su opcion: ");
            int opc = read.nextInt();
            int conf = 1;

            switch(opc){
                case 1->{
                    System.out.println();
                    System.out.println("----------Inversion especial----------");
                    System.out.println("Ingrese la cadena: ");
                    read.nextLine();
                    String text = read.nextLine();
                    String acum ="";
                    String acumtotal ="";
                    String acum2="";

                     
                    for(int i=0;i<text.length();i++){
                        acum2+=i;
                        if(text.charAt(i)==' '){
                            for(int j=text.length()-1;j>=0;j--){
                                acum += text.charAt(j);
                            }
                            acumtotal += acum;
                            acum="";
                        }
                    }
                    System.out.println("Cadena invertida: " + acumtotal );
                    break;
                }
                case 2->{
                    System.out.println();
                    System.out.println("----------Balanza de cadenas----------");
                    System.out.println("Debe ingresar 3 cadenas");
                    System.out.print("Ingrese la cadena 1: ");
                    read.nextLine();
                    String cad1 = read.nextLine();
                    System.out.print("Ingrese la cadena 2: ");
                    String cad2 = read.nextLine();
                    System.out.print("Ingrese la cadena 3: ");
                    String cad3 = read.nextLine();
                    int c1val2=0, c2val2=0,c3val2=0;
                     
                    
                    for(int i=0;i<cad1.length();i++){
                        char prim = cad1.charAt(i);
                        int c1val = (int)prim;
                        c1val2 = c1val2+c1val;
                    }
                    System.out.println("Valor de cadena 1: " + c1val2);
                    
                    for(int i=0;i<cad2.length();i++){
                        char prim = cad2.charAt(i);
                        int c2val = (int)prim;
                        c2val2 = c2val2+c2val;
                    }
                    System.out.println("Valor de cadena 2: " + c2val2);
                    
                    for(int i=0;i<cad3.length();i++){
                        char prim = cad3.charAt(i);
                        int c3val = (int)prim;
                        c3val2 = c3val2+c3val;
                    }
                    System.out.println("Valor de cadena 3: " + c3val2);
                    
                    if(c1val2>c2val2 && c1val2>c3val2){
                        System.out.println("La cadena 1 es la mas pesada");
                    }else if(c2val2>c1val2 && c2val2>c3val2){
                        System.out.println("La cadena 2 es la mas pesada");
                    }else if(c3val2>c1val2 && c3val2>c2val2){
                        System.out.println("La cadena 3 es la mas pesada");
                    }else{
                        System.out.println("Hay dos o mas valores iguales.");
                    }
                }
                case 3->{
                    System.out.println();
                    System.out.println("----------Cifrado de mensajes----------");
                    System.out.print("Ingrese el mensaje que desea cifrar: ");
                    read.nextLine();
                    String msj = read.nextLine();
                    String tot = "";
                    
                    for(int i=0;i<msj.length();i++){
                        char des = msj.charAt(i);
                        int num = (int)des;
                        int num2 = num+2;
                        char des2 = (char)num2;
                        tot +=des2;  
                    }
                    System.out.println("Mensaje cifrado: " + tot);
                    
                }
                case 4->{
                    System.out.println( );
                    System.out.println("Saliendo del programa...");
                    continuar='n';
                    conf=0;
                }
                default->{
                    System.out.println();
                    System.out.println("Opcion invalida");
                }
            }
            if(conf==1){
                System.out.println();
                System.out.print("Desea regresar al menu inicial (s/n)?: ");
                continuar = read.next().charAt(0);
            }    
        }
    }  
}
