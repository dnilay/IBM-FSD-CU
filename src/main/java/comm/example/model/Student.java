package comm.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.LinkedHashMap;
import java.util.Map;

@AllArgsConstructor
@Getter
@Setter
public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private String country;
    private String[] operatingSystems;
    private String language;
    private Map<String,String> map;
    public Student() {
        map=new LinkedHashMap<String, String>();
        map.put("BR","Brazil");
        map.put("UK","United Kingdom");
        map.put("IN","India");
        map.put("FR","France");
        map.put("USA","United States Of America");
    }
}
