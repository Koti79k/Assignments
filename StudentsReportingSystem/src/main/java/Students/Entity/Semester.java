package Students.Entity;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Semester {

    private int semId; 
    private int English = 0;
    private int Maths = 0;
    private int Science = 0;
    
    public Semester(int semId) {  
      this.semId = semId;
    }
}
