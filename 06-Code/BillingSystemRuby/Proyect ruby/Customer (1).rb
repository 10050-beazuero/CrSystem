class Customer
	attr_accessor :names, :lastname, :adress, :document, :phone
	def initialize()
		@names = names
		@lastname = lastname
		@adress = adress
		@document=document
		@phone = phone 
		
	end
	def registerCustomer()
		puts "Enter customer name"
		names = gets
		puts "Enter customer's last name"
		lastname =gets
		puts "Enter customer address"
		adress = gets
		puts "Enter the customer's document ID"
		document = gets
		puts "Enter the customer's phone number"
		phone = gets

		puts "************************"
		puts "name : #{names}"
		puts "Lastname : #{lastname}"
		puts "Adress : #{adress}"
		puts "Document : #{document}"
		puts "Phone is: #{phone}" 


	end


end