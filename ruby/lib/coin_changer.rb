module CoinChanger
  def self.make_change_for(total)
    change_array = Array.new
    coins = [25, 10, 5, 1]

    coins.each do |coin|
      while total >= coin
        change_array << coin
        total -= coin
      end
    end

    change_array
  end
end
