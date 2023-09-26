#DIALOG

//showMessageDialog

        JFrame jFrame = new JFrame("Hola Mundo");
        JOptionPane.showMessageDialog(jFrame, "Hola, como estas hoy?");

//showMessageDialog

        JFrame jFrame = new JFrame("Ventana");
        String nombre = JOptionPane.showInputDialog(jFrame, "Ingresa tu nombre");
        JOptionPane.showMessageDialog(jFrame, "Bienvenido: "+nombre);
        
//JOptionPane.showConfirmDialog() 

        JFrame jFrame = new JFrame("ventana de opciones");
        int result = JOptionPane.showConfirmDialog(jFrame, "Presiona un boton");
        if (result == 0){
            System.out.println("Presionaste si");
        }else if (result == 1){
            System.out.println("Presionaste no");
        }else{
            System.out.println("Presionaste cancelar");
        }

#VENTANA

        JFrame ventana1 = new JFrame("Ventana 1");
        ventana1.setSize(400,300);
        ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana1.setVisible(true);

#EXTENDIDA

        public void extend(){
            MiVentana v = new MiVentana ();
            v.setVisible (true);
        }

        class MiVentana extends JFrame{
        public MiVentana (){
            super ("Titulo de ventana");
            setSize (400, 300);
            setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        }
      }

#COMPONENTES

        JFrame miVentana = new JFrame();
        miVentana.setTitle( "Mi Ventana 02" );
        miVentana.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        //crear layout
        miVentana.setLayout( new FlowLayout() );
        //miVentana.pack(); //que se adecue al tamaño de la ventana
        miVentana.setSize(400,300);
        //etiqueta nombre
        JLabel etiqueta = new JLabel("Nombre:");
        //cuadro de texto
        JTextField texto = new JTextField(20);
        //boton
        JButton boton = new JButton("saludar");
        //siempre add
        miVentana.add(etiqueta);
        miVentana.add(texto);
        miVentana.add(boton);
        miVentana.setVisible( true );
