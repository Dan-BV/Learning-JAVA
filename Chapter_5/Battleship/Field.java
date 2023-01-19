public class Field {
    char[] cells = {'_','_','_','_','_','_','_'};

    public void cellsChange(int g, String r){
        if(r=="Попал" || r=="Потопил"){
            cells[g] = 'X';
        }
    }

    public void draw(){
        System.out.println(cells);
    }
}
