public class SumaCoche {
        public static void main(String[] args)
        {
        Coche miCoche=new Coche();
            miCoche.agregarP();
            miCoche.mostrarP();
        
        int resultado;
                resultado = suma ( 52, 28, 44 );
                System.out.println("El resultado de la suma es:" +resultado);
        }
        public static int suma (int a,int b, int c) {
            return a + b + c ; 
        }


        public static class Coche {
                int numeroP=4;
                Coche(){   
                }

                public void agregarP(){
                    numeroP++;
                    
                }
                public void mostrarP(){
                    System.out.println("La cantidad de puerta es:" + numeroP );
                }
            }
        }