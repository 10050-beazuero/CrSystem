class Person
	attr_accessor :name,:document,:lastName,:adress,:phone
def add()
	def escritura()
		File.open('person.txt',"W") do |f|
		f.print"Write your name"
		f.nombre = gets.chomp
		f.print"Write your identification document"
		f.id = gets. chomp
		f.print"Write your lastname"
		f.lname = gets.chomp
		f.print"Write your adress"
		f.adress = gets. chomp
		f.print"Write your phone"
		f.phone =gets.chomp
	end
	def lectura()
		File.open('person.txt',"W") do |f|
			while linea = f.gets()
				puts linea
			end
		end
	end
end
def remove()
	arreglo.delete #{c}
end
def modify()
end
def search()
end
def searchReport()
end

end

class Suplier
	attr_accessor :tradenName,:articleName
def suplierConsult()
	def escritura()
		File.open('suplier.txt',"W") do |f|
		f.print"Write the name of the suplier"
		f.tradenName = gets.chomp
		f.print"Write the article"
		f.articleName = gets.chomp
	end
	def lectura()
		File.open('suplier.txt',"W") do |f|
			while linea = f.gets()
				puts linea
			end
		end
	end
end
def itemStatus()
	File.open('suplier.txt',"W") do |f|
		while linea=f.gets
			puts linea
end

end

class Article
		attr_accessor :code,:description,:durability,:type,:salePrice,:costPrice
	def enter()
		def escritura()
			File.open('article.txt',"W") do |f|
			f.print"Write the code"
			f.code = gets.chomp
			f.print"Write the description"
			f.description = gets.chomp
			f.print"Write the durability"
			f.durability = gets.chomp
			f.print"Write the type"
			f.type = gets.chomp
			f.print"Write the salePrice"
			f.salePrice =gets.chomp
			f.print"Write the costPrice"
			f.costPrice =gets.chomp
		end
		def lectura()
			File.open('article.txt',"W") do |f|
				while linea = f.gets()
					puts linea
				end
			end
		end
	end
	end
	def modify()
	end
	def delete()
	end
	def check()
	end
	def search()
	end
	def showData()
		File.open('article.txt',"W") do |f|
			f.print code
			f.print description
			f.print durability
			f.print type
			f.print salePrice
			f.print costPrice
	end
	def valuate()
	end

end

class Customer
		attr_accessor :name,:document,:lastName,:adress,:phone
	def payment()
	end

end

class Menu
	def main()
		print "Menu\n 1.Customers\n 2.Articles\n 3.Billing\n 4.Supliers\n 5.Exit\n"
		opcion = (gets.chomp).to_i

		case opcion
			when 1
					c = Customer.new
					print "Menu\n 1.Add\n 2.Exit\n "
					opcion = (gets.chomp).to_i
					case option
						when 1
							c.payment()
							gets()
						when 2
						else
						print "Option not reconiced"
					end
				end
			end
			when 2
						a = Articles.new
						print "Menu\n 1.Enter\n 2.Modify\n 3.Delete\n 4.Check\n 5.Search\n 6.Show data\n 7.Valuate\n 8. Exit\n"
						opcion = (gets.chomp).to_i
						case option
							when 1
								a.enter()
								gets()
							when 2
								a .modify()
								gets()
							when 3
								a.delete()
								gets()
							when 4
								a.check()
								gets()
							when 5
								a.search()
								gets()
							when 6
								a.showData()
								gets()
							when 7
								a.valuate()
								gets()
							when 8
							else
								print "Option not reconiced"
						end
			end
			when 3
						b = Bill.new
						print "Menu\n 1.Generate\n 2.Add data\n 3.Print\n 4.Search\n 5.Payment method\n 6.See Invoice\n 7.Exit\n"
						opcion = (gets.chomp).to_i						
						case option
								when 1
									a.generateInvoice()
									gets()
								when 2
									a .dataEntry()
									gets()
								when 3
									a.printInvoice()
									gets()
								when 4
									a.searchInvoice()
									gets()
								when 5
									a.selectPaymentMethod()
									gets()
								when 6
									a.seeInvoice()
									gets()
								when 7
								else
									print "Option not reconiced"
							end
						end
			end
			when 4
					s = Suplier.new
					print "Menu\n 1.Consult\n 2.Status\n 3.Exit\n "
					opcion = (gets.chomp).to_i
					case option
						when 1
							s.suplierConsult()
							gets()
						when 2
							s.itemStatus()
							gets()
						when 3
						else
							print "Option not reconiced"
					end
			end
			when 5
		end
	end
end



m = Menu.new
m.main()
gets

















