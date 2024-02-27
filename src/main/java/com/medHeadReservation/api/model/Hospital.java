package com.medHeadReservation.api.model;





import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "hospital")
public class Hospital {
	
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	  
	    @Column(name = "name", nullable = false, length = 255)
	    private String name;

	    @Column(name = "latitude", nullable = true)
	    private Double latitude;

	    @Column(name = "longitude", nullable = true)
	    private Double longitude;
	    
	    
	    @Column(name = "lit", nullable = true)
	    private Long lit;
	    
	   @Column(name = "numeroderue", nullable = true, length = 10)
	    private String numeroDeRue;
	    
	  @Column(name = "nomdelarue", nullable = true)
	   private String rue;

	  

	    
	    @Column(name = "postal", nullable = true, length = 10)
	    private String postal;

	//	@ManyToMany
	//	@JoinTable(
	//		name = "hospitalSpecialization",
	 //     joinColumns = @JoinColumn(name = "hospital_id"),
	 //     inverseJoinColumns = @JoinColumn(name = "specialization_id")
	//    )
	 
	  //  private Set<Specialization> specializations = new HashSet<>();

	
		
	  
	    
    
    
}

