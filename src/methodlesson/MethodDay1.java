package methodlesson;


public class MethodDay1 {
    static int findMaximumValue(int ...v){
        for(int i=0;i<v.length;i++){
            for(int j=0;j<v.length-1-i;j++){
                if(v[j]>v[j+1]){
                    int temp = v[j];
                    v[j] = v[j+1];
                    v[j+1] =temp;
                }
            }
        }
        return v[v.length-1];
    }
    public static void main(String[] args) {
        int result = findMaximumValue(90,324,6,8,3,6,3,4,45,4,4,544,4);
        System.out.println("Maximum: " + result);
    }
}
