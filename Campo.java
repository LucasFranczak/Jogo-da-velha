public class Campo {
    private char simbolo;
    public Campo (){
        this.simbolo = ' ';
    }
    public char getsimbolo(){
        return this.simbolo;
    }
    public void setsimbolo(char simbolo){
        if (this.simbolo==' '){
            this.simbolo=simbolo;
        } else {
            System.out.print("Campo já usado");
        }
    }
}
