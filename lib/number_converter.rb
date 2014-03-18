module NumberConverter
  def self.to_roman(arabic)
    roman_string = String.new
    conversions = [
      [1000, 'M'],
      [500, 'D'],
      [400, 'CD'],
      [100, 'C'],
      [90, 'XC'],
      [50, 'L'],
      [40, 'XL'],
      [10, 'X'],
      [9, 'IX'],
      [5, 'V'],
      [4, 'IV'],
      [1, 'I']
    ]

    conversions.each do |ar, rm|
      while arabic >= ar
        roman_string << rm
        arabic -= ar
      end
    end

    roman_string
  end
end
