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

  def self.to_arabic(roman)
    arabic = 0
    keys = [
      ['M', 1000, 'C', 100],
      ['D', 500, 'C', 100],
      ['C', 100, 'X', 10],
      ['L', 50, 'X', 10],
      ['X', 10, 'I', 1],
      ['V', 5, 'I', 1],
      ['I', 1, nil, 0]
    ]

    while roman.length >= 1
      keys.each do |roman_numeral, value, subtractor_numeral, subtractor_value|
        if roman[-1] == roman_numeral
          if roman[-2] == subtractor_numeral
            arabic += (value - subtractor_value)
            roman.chop!.chop!
          else
            arabic += value
            roman.chop!
          end
        end
      end
    end

    arabic
  end
end
