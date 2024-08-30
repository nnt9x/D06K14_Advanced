package tinhdahinh;

public class Con extends Cha{

    public void hoc(){
        System.out.println("Chăm học");
    }
    public void theThao(String moTa){
        System.out.println(moTa);
    }

    @Override
    public void theThao() {
        System.out.println("Thích chơi game");
    }
}
