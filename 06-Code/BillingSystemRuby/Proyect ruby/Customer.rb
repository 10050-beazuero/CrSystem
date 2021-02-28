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
		puts "***********************"
		outCustomer(names,lastname,adress,document,phone)
	end
	def outCustomer(names,lastname,adress,document,phone)
		puts "Names: #{names}"
		puts "lastname : #{lastname}"
		puts "adress : #{adress}"
		puts "document : #{document}"
		puts "phone : #{phone}"

	end


end