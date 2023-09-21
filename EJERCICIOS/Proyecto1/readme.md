
        public UsuarioJpaController(){
                emf = Persistence.createEntityManagerFactory("pruebajpa2PU");
            }
.
            

            UsuarioJpaController usuaJpa = new UsuarioJpaController();

.

         ControladoraPersistencia controlapersi = new ControladoraPersistencia();

.

          public void crearUsuario(Usuario usua){
                controlpersi.crearUsuario(usua);
            }

            
