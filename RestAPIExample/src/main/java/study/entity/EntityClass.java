package study.entity ;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DBTable")
public class EntityClass {
	
/*	Status
	2. User ID
	3. Email ID
	4. College Roll Number
	5. Array for numbers
	6. Array for alphabets */
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="User_Id")
	private int user_Id ;
	
	@Column(name="Status")
	private boolean status;
	
	@Column(name = "Email_Id")
	private String email_Id;
	
	@Column(name="Roll_no")
	private int roll_no;
	
	@Column(name="Numbers")
	private int num[];
	
	@Column(name="Alphabets")
	private char alpha[];
	
	public EntityClass(int user_Id, String email_Id, int roll_no, int[] num, char[] alpha) {
		super();
		this.user_Id = user_Id;
		this.email_Id = email_Id;
		this.roll_no = roll_no;
		this.num = num;
		this.alpha = alpha;
	}
	
	public EntityClass()
	{
		
	}

	
	public int getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}

	public String getEmail_Id() {
		return email_Id;
	}

	public void setEmail_Id(String email_Id) {
		this.email_Id = email_Id;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public int[] getNum() {
		return num;
	}

	public void setNum(int[] num) {
		this.num = num;
	}

	public char[] getAlpha() {
		return alpha;
	}

	public void setAlpha(char[] alpha) {
		this.alpha = alpha;
	}

	@Override
	public String toString() {
		return "EntityClass [user_Id=" + user_Id + ", email_Id=" + email_Id + ", roll_no=" + roll_no + ", num="
				+ Arrays.toString(num) + ", alpha=" + Arrays.toString(alpha) + "]";
	}
	
	
	
	

}
