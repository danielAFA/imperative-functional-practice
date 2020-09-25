def average_number_of_letters(names)
  return 0.0 if names.empty?
  
  total_letters = 0.0

  for name in names
    total_letters += name.length
  end

  total_letters / names.length
end

def group_by_first_letter(names)
  return {} if names.empty?

  name_groups = Hash.new([])

  for name in names
    name_groups[name[0]] += [name]
  end

  name_groups
end

def num_names_by_first_letter(names)
  return {} if names.empty?

  name_groups = Hash.new(0) 

  for name in names
    name_groups[name[0]] += 1
  end

  name_groups
end

def average_number_of_letters_immutable(names)
  return 0.0 if names.empty?

  total_letters = names.map { |name| name.length }.sum.to_f

  total_letters / names.length 
end

def group_by_first_letter_immutable(names)
  return {} if names.empty?

  names.group_by { |name| name[0] }
end

def num_names_by_first_letter_immutable(names)
  return {} if names.empty?

  names.group_by { |name| name[0] }.transform_values(&:length)
end
