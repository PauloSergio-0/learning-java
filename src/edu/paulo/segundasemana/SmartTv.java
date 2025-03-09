package edu.paulo.segundasemana;

public class SmartTv {

    boolean statusTv = false;
    int canalTv = 1;
    int volumeTv = 0;

    public void status(boolean status) {

        String mensagem = status ? "Ligada" : "Desligada";

        if(this.statusTv == status) {
            System.out.println("A tv já esta: " + mensagem);
        } else {
            this.statusTv = status;
            System.out.println("A tv foi " + mensagem);
        }

    }

    public void canalTv(int canal) {

        if(!statusTv) {
            System.out.println("A TV esta desligada");
            return;
        }

        if(canal >= 1 && canal <= 100) {
            if(this.canalTv == canal) {
                System.out.println("A tv já está no canal: " + canal);

            }else {
                this.canalTv = canal;
                System.out.println("Canal alterado para:  " + canal);
            }

        }else if (canal == 0) {
            this.canalTv += 1;
            System.out.println("Passou para o canal: "+ this.canalTv);
        }else if (canal < 0) {

            this.canalTv -= 1;
            System.out.println("Passou para o canal: "+ this.canalTv);
        }else {
            System.out.println("Não foi possível concluir operção");
        }
    }


    public void volumeTv(int vol) {

        if(!statusTv) {
            System.out.println("A TV esta desligada");
            return;
        }

        if(vol >= 1 && vol <= 100) {
            if(this.volumeTv == vol) {
                System.out.println("A tv já está no volume: " + vol);

            }else {
                this.volumeTv = vol;
                System.out.println("volume alterado para:  " + vol);
            }

        }else if (vol == 0) {
            this.volumeTv += 1;
            System.out.println("Passou para o volume: "+ this.volumeTv);
        }else if (vol < 0) {

            this.volumeTv -= 1;
            System.out.println("Passou para o volume: "+ this.volumeTv);
        }else {
            System.out.println("Não foi possível concluir operção");
        }
    }
}
