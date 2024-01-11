public class solar {
    int nombresMeses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
      private double [] horas;
    public EstadisticaLuzSolar() {
        horas = new double[] = {100, 90, 120, 150, 210, 250, 300, 310, 280, 230, 160,
                120};
    }
   public double getMedia(){
          double suma = 0;
          for (int i = 0; i < this.horas.length; i++){
              suma += this.horas[i];
          }
          return suma/ this.horas.length
   }

    public String mesMasSoleado(){
          int PosicionMax;
          double valorMax = horas[0];
          for(int i = 0; i < horas.length; i++){
              if(horas[i]>valorMax){
                  valorMax = horas[i];
                  posicionMax = i;
              }
          }
    }
}
