package demo

//@groovy.transform.CompileStatic
class MyService{

	String method(){

		//def result = Quiz.findAllByNameLike('test%')
		/*
		def result = Quiz.withCriteria{
			eq('name', 'test 1')
		}
		def result = Quiz.withCriteria{
			'in'('name',['test 1', 'test 2'])
		}
		def result = Quiz.find("from Quiz q where q.name like :name",[name: 'test 1%'])

		def result = Quiz.find(new Quiz(name: 'test 1'))*/


		println result

		return "Hello there"
	}
}
