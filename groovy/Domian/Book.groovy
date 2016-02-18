class BookBean {
   String title
   
}
       
def groovyBook = new BookBean()
groovyBook.setTitle('Groovy conquers the world')
assert groovyBook.getTitle() == 'Groovy conquers the world'

groovyBook.title = 'Groovy in Action'
assert groovyBook.title == 'Groovy in Action'

