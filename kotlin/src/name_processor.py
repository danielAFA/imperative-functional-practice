from itertools import groupby
from collections import defaultdict

def average_number_of_letters(names):
    if not names:
        return 0.0

    totalLetters = 0.0

    for name in names:
        totalLetters += len(name)

    return totalLetters/len(names)


def group_by_first_letter(names):
    if not names:
        return {}

    groups_by_name = defaultdict(list)

    for name in names:
        groups_by_name[name[0]].append(name)

    return groups_by_name


def num_names_by_first_letter(names):
    if not names:
        return {}

    names_per_letter = {}

    for name in names:
        names_per_letter[name[0]] = names_per_letter.get(name[0], 0) + 1

    return names_per_letter
  
def average_number_of_letters_immutable(names):
  if not names:
    return 0.0

  total_letters = sum([len(name) for name in names])

  return total_letters / len(names)

def group_by_first_letter_immutable(names):
  if not names:
    return {}
  
  return dict(map(lambda grouped: (grouped[0], list(grouped[1])), groupby(sorted(names), lambda name: name[0])))

def num_names_by_first_letter_immutable(names):
  if not names:
    return {}
  
  return dict(map(lambda grouped: (grouped[0], len(list(grouped[1]))), groupby(sorted(names), lambda name: name[0])))