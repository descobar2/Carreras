import java.util.Scanner;

class Main {
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int vueltas=0;
	int nAutos = 0;
	int [][]tiempo = new int[nAutos][vueltas];
    double distancia = 0;
    double promedio = 0;
    double velocidadPro = 0;
    int tTotal = 0;
    int opcion = 0;
    
    while(opcion != 3) {
        int contador = 1;
    	mostrarMenu();
    	opcion = scan.nextInt();
    	
    	switch (opcion) {
    	case 1:
    		System.out.println("Ingrea numero de autos");
    		nAutos = scan.nextInt();
    	    System.out.println("Ingrese numero de vueltas: ");
    	    vueltas = scan.nextInt();
    	    System.out.println("Ingrese tama\u00F1o de la pista en Kilometros: ");
    	    distancia = scan.nextInt();
    	    tiempo = new int[nAutos][vueltas];
    	    for(int i=0; i<nAutos; i++){
    	    	
    	      System.out.println("\nAuto No." + contador);
    	      for (int j = 1; j <= vueltas; j++) {
    	        System.out.println("Ingrese tiempo de vuelta " + j + " en segundos: ");
    	        tiempo[i][j-1] = scan.nextInt();
    	        tTotal = tTotal + tiempo[i][j-1];
    	      }
    	      promedio = tTotal/vueltas;
    	      velocidadPro = (distancia/(promedio/3600));  	      
    	      System.out.println("El promedio por vuelta en Km/h es: " + velocidadPro);
    	      System.out.println("");
    	      contador++;
    	    }
    	    contador = 1;
    	    break;
    	case 2:
    		if (nAutos!= 0 && vueltas != 0){
        		for(int i=0; i<nAutos; i++){
          	      System.out.println("\nAuto No." + contador);
          	      for (int j = 1; j <= vueltas; j++) {
          	        System.out.println("Vuelta " + j + ": " + tiempo[i][j-1]);
          	      }
          	      contador++;
          	    System.out.println("El promedio en Km/h es: " + velocidadPro);
        		}
    		}else {
    			System.out.println("Debe ingresar datos en la opcion No. 1");
    		}
    		break;
    	case 3:
    		break;
    	default:
    		System.out.println("Opcion invalida.");
    	}
    }
    scan.close();
  }
  public static void mostrarMenu() {
	System.out.println("\n\t\tCarrera");
	System.out.println("1. Ingresar datos de carrera. ");
	System.out.println("2. Mostrar resultados");
	System.out.println("3. Salir");
  }
}
