Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y cantidad (puede tener decimales).

El titular será obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo anterior.

Crea sus métodos get, set y toString.

Tendrá dos métodos especiales:

ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.
        
        
        /**
         * Clase Cuenta
         */
        public class Cuenta {

            //Atributos
            private String titular;
            private double cantidad;

            //Constructores
            public Cuenta(String titular) {
                this(titular, 0); //Sobrecarga
            }

            public Cuenta(String titular, double cantidad) {
                this.titular = titular;
                //Si la cantidad es menor que cero, lo ponemos a cero
                if (cantidad < 0) {
                    this.cantidad = 0;
                } else {
                    this.cantidad = cantidad;
                }
            }

            //Metodos
            public String getTitular() {
                return titular;
            }

            public void setTitular(String titular) {
                this.titular = titular;
            }

            public double getCantidad() {
                return cantidad;
            }

            public void setCantidad(double cantidad) {
                this.cantidad = cantidad;
            }

            /**
             * Ingresa dinero en la cuenta, 
             * solo si es positivo la cantidad
             *
             * @param cantidad
             */
            public void ingresar(double cantidad) {
                if(cantidad > 0){
                    this.cantidad += cantidad;   
                }
            }

            /**
             * Retira una cantidad en la cuenta, si se quedara en negativo se quedaria
             * en cero
             *
             * @param cantidad
             */
            public void retirar(double cantidad) {
                if (this.cantidad - cantidad < 0) {
                    this.cantidad = 0;
                } else {
                    this.cantidad -= cantidad;
                }
            }

            /**
             * Devuelve el estado del objeto
             *
             * @return
             */
            @Override
            public String toString() {
                return "El titular " + titular + " tiene " + cantidad + " euros en la cuenta";
            }

        }
        
        
clase ejecutable


        public class CuentaApp {

            public static void main(String[] args) {

                Cuenta cuenta_1 = new Cuenta("DiscoDurodeRoer");
                Cuenta cuenta_2 = new Cuenta("Fernando", 300);

                //Ingresa dinero en las cuentas
                cuenta_1.ingresar(300);
                cuenta_2.ingresar(400);

                //Retiramos dinero en las cuentas
                cuenta_1.retirar(500);
                cuenta_2.retirar(100);

                //Muestro la informacion de las cuentas
                System.out.println(cuenta_1); // 0 euros
                System.out.println(cuenta_2); // 600 euros

            }

        }
        
