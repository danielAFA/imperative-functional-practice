require_relative "name_processor"

class PrintResults
  def print_results
    
    names = ["Fadi", "Timothy", "Derrick", "Omar", "Hiep", "Alexander", "Daniel", "Isela", "Jackqueline",
        "Bryan", "Nguyen", "Maxim", "Edgar", "Ahson", "Abdulkadir", "En-Kai", "Karla", "Panpan", "You", "Andrew",
        "Trevor", "Hoang", "Johnson", "Janelle", "Moujie", "MD", "Albert", "Jiahui", "Alejandro", "Venkat"]

    puts average_number_of_letters(names)

    puts group_by_first_letter(names)
    
    puts num_names_by_first_letter(names)
    
    puts average_number_of_letters_immutable(names)
    
    puts group_by_first_letter_immutable(names)
    
    puts num_names_by_first_letter_immutable(names)
  end
end