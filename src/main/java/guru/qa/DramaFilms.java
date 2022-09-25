package guru.qa;

import java.util.HashMap;
import java.util.Map;

public class DramaFilms {
    private Map<String, String> dramas = new HashMap<>();

    public void addDrama(String movie,String director){
        dramas.put(movie, director);
    }

    public void printAll(){
        for(Map.Entry<String,String> entry : dramas.entrySet()){
            System.out.println("Movie - " + entry.getKey() + ", director - " + entry.getValue());
        }
    }

    public void removeElement(String movie){
        dramas.remove(movie);
    }

    public boolean isExist(String movie, String director){
        for(Map.Entry<String,String> entry : dramas.entrySet()) {
            if(entry.getKey().equals(movie) && entry.getValue().equals(director)){
                return true;
            }
        }
        return false;
    }
}
