'''number_of_pupils / total_teams / pupils_remaining'''
'''     150                30              0           '''
'''     167                33              2           '''
'''     149                29              4            '''

number_of_pupils = int( input ("Please enter the number of pupils in school") )
total_teams = number_of_pupils// 5
pupils_selected = total_teams * 5
pupils_remaining = number_of_pupils - pupils_selected
print (total_teams)
print (pupils_remaining)