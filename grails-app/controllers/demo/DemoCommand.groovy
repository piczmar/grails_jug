package demo
import org.grails.databinding.BindingFormat

@grails.validation.Validateable(nullable=true)
class DemoCommand{
	String name
	BigDecimal weight
	@BindingFormat('yyyy-MM-dd')
	Date dob
	static constraints = {
		name nullable: false
	}


	String toString(){
		return "$name, $weight, $dob"
	}
}
