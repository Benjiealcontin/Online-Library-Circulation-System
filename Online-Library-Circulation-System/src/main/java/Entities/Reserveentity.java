package Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Reserve_Entity")
public class Reserveentity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private long bookId;
	
    @Size(max = 30)
	private String studentID;
	
    @Size(max = 30)
	private String firstname;
	
    @Size(max = 30)
	private String lastname;
	
    @Size(max = 30)
	private String department;
	
    @Size(max = 30)
	private String course;
	
    @Size(max = 30)
	private String email;
	
    @Size(max = 30)
	private String status;
    
    @Size(max = 30)
	private String booktitle;
    
    @Size(max = 30)
    private String reserveAt;
    
}
