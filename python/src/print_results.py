from name_processor import *

names = ["Fadi", "Timothy", "Derrick", "Omar", "Hiep", "Alexander", "Daniel", "Isela", "Jackqueline",
        "Bryan", "Nguyen", "Maxim", "Edgar", "Ahson", "Abdulkadir", "En-Kai", "Karla", "Panpan", "You", "Andrew",
        "Trevor", "Hoang", "Johnson", "Janelle", "Moujie", "MD", "Albert", "Jiahui", "Alejandro", "Venkat"]

print("%.2f" % average_number_of_letters(names))
print(group_by_first_letter(names))
print(num_names_by_first_letter(names))
print("%.2f" % average_number_of_letters_immutable(names))
print(group_by_first_letter_immutable(names))
print(num_names_by_first_letter_immutable(names))