 def date = [0, 8, 6] as Date               
    assert 1900 == date[Calendar.YEAR]
    assert 8    == date[Calendar.MONTH]
    assert 6    == date[Calendar.DATE]
