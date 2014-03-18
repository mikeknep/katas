module Fizzbuzz
  def self.up_to(number)
    string = String.new

    (1..number).each do |n|
      string << "fizz" if n % 3 == 0
      string << "buzz" if n % 5 == 0
      string << "#{n}" if n % 3 != 0 && n % 5 != 0

      string << " " unless n == number
    end

    string
  end
end
