# Custom-Dialog
Custom Dialog es una librería para java swing que permite crear Dialogs personalizados y mas bonitos :D  
( Scream es el fondo negro trsnsparente que se encuentra detras del Alert Dialog )

<br/>

Metodos:<br/><br/>
<strong>setTitle</strong> - Añade un titulo al dialog <br/>
<strong>setMessege</strong> - Añade un mensaje al dialog <br/>
<strong>setCancel</strong> - Si el valor es True permete cerrar el dialog cada ves que se preciona fuera del dialog <br/>
<strong>setDialogScreamTransparent</strong> - Le añade transparencia el Scream <br/>
<strong>showDialog</strong> - Permite mostrar el dialog siempre y cuando el valor sea true (No utilicen setVisible !!) <br/>

<h1>Example :</h1><br/><br/>

        AlertDialog myDialog = new AlertDialog(
                new Dimension(450 , 180),
                true
            );
            myDialog.setScreamColor(Color.BLACK);
            myDialog.setTitle("Error");
            myDialog.setMessege("Eso es un mensaje de error");
            myDialog.setCancel(true);
            myDialog.setDialogScreamTransparent(0.7f);

            myDialog.setPostiveButton("SALUDAR", new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Esto es un saludo");
                    System.exit(0);
                }
            });
            myDialog.showDialog();




<br/>
<h1>screenshots : </h1>
<br/>

![alt text](https://github.com/SirRiuz/Custom-Dialog/blob/master/img/scream.png)
![alt text](https://github.com/SirRiuz/Custom-Dialog/blob/master/img/scream_1.png)
![alt text](https://github.com/SirRiuz/Custom-Dialog/blob/master/img/scream_2.png)



