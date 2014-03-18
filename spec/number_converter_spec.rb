require 'spec_helper'

describe NumberConverter do
  tests = [
    [1, 'I'],
    [2, 'II'],
    [3, 'III'],
    [4, 'IV'],
    [5, 'V'],
    [6, 'VI'],
    [7, 'VII'],
    [8, 'VIII'],
    [9, 'IX'],
    [10, 'X'],
    [11, 'XI'],
    [14, 'XIV'],
    [15, 'XV'],
    [19, 'XIX'],
    [22, 'XXII'],
    [26, 'XXVI'],
    [39, 'XXXIX'],
    [40, 'XL'],
    [49, 'XLIX'],
    [50, 'L'],
    [88, 'LXXXVIII'],
    [90, 'XC'],
    [100, 'C'],
    [400, 'CD'],
    [500, 'D'],
    [1000, 'M'],
    [3899, 'MMMDCCCXCIX']
  ]

  tests.each do |arabic, roman|
    it "converts #{arabic} to #{roman}" do
      expect(NumberConverter.to_roman(arabic)).to eq(roman)
    end
  end
end
