<%@ page import="demo.Question" %>



<div class="fieldcontain ${hasErrors(bean: questionInstance, field: 'body', 'error')} required">
	<label for="body">
		<g:message code="question.body.label" default="Body" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="body" required="" value="${questionInstance?.body}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: questionInstance, field: 'quiz', 'error')} required">
	<label for="quiz">
		<g:message code="question.quiz.label" default="Quiz" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="quiz" name="quiz.id" from="${demo.Quiz.list()}" optionKey="id" required="" value="${questionInstance?.quiz?.id}" class="many-to-one"/>

</div>

