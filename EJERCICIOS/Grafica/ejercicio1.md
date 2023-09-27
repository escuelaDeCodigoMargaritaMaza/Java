creando la ventana

      import javax.swing.*;  
      public class Graf extends JFrame{  
          
      
      
        
      
          public static void main(String[] args){
            
              Graf ventana1 = new Graf();
              ventana1.setBounds(50,50,400,300); 
              ventana1.setVisible(true);
              ventana1.setResizable(false);
              ventana1.setTitle("ejercicio1");  
          
       }
      }

primer elemento

      import javax.swing.*;  
      public class Graf extends JFrame{  
      private JLabel texto1;


      public Graf(){
          setLayout(null);
  
          texto1 = new JLabel("Ingresa tu nombre");
          texto1.setBounds(10,7,200,100);
          add(texto1);
      }

  

      public static void main(String[] args){
        
          Graf ventana1 = new Graf();
          ventana1.setBounds(50,50,400,300); 
          ventana1.setVisible(true);
          ventana1.setResizable(false);
          ventana1.setTitle("ejercicio1");  
      
       }
      }

demas elementos
    
    import javax.swing.*;  
    public class Graf extends JFrame{  
    private JLabel texto1;
    private JTextField cajatexto1;
    private JLabel texto2;
    private JTextField cajatexto2;
    private JButton boton1;
    private JButton boton2;
    private JTextField cajatexto3;
 


    public Graf(){
        setLayout(null);

        texto1 = new JLabel("Ingresa tu nombre");
        texto1.setBounds(10,7,200,100);
        add(texto1);

        cajatexto1=new JTextField();
        cajatexto1.setBounds(10,70,350,20);
        add(cajatexto1);

        texto2 = new JLabel("Ingresa tu apellido");
        texto2.setBounds(10,60,200,100);
        add(texto2);

        cajatexto2=new JTextField();
        cajatexto2.setBounds(10,120,350,20);
        add(cajatexto2);

        cajatexto3=new JTextField();
        cajatexto3.setBounds(10,170,350,20);
        add(cajatexto3);

        boton1 = new JButton("enviar");
        boton1.setBounds(10,200,100,30);
        add(boton1);

        boton2 = new JButton("borrar");
        boton2.setBounds(150,200,100,30);
        add(boton2);
    }

  

    public static void main(String[] args){
      
        Graf ventana1 = new Graf();
        ventana1.setBounds(50,50,400,300); 
        ventana1.setVisible(true);
        ventana1.setResizable(false);
        ventana1.setTitle("ejercicio1");  
        
     }
    }
