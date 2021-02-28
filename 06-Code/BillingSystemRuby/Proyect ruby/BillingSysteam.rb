require_relative 'Customer.rb'
customer = Customer.new()
def menu()
	puts "-------------Minimarket-------------"
	puts " "
	puts "1. Customers"
	puts "2. Articles"
	puts "3. Billing"
	puts "4. Suppliers"
	puts "5. Exit "
	puts" Select the opction: "
end

menu()
option= gets.to_i

while option !=5
	case option
	when 1
        print "\nCustomer registration"
        customer.registerCustomer()
		gets()
		system ("cls")
		menu()
        option = gets.to_i
	else
	print " \n option no recognized"
    gets()
    system ("cls")
    menu()
    option = gets.to_i  
	end

end




