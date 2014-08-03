<%@ page import="demo.Quiz" %>



<div class="fieldcontain ${hasErrors(bean: quizInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="quiz.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" value="${quizInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: quizInstance, field: 'description', 'error')} ">
	<label for="description">
		<g:message code="quiz.description.label" default="Description" />
		
	</label>
	<g:textField name="description" value="${quizInstance?.description}"/>

</div>

