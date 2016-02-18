def cal = Calendar.instance
cal.with {
    clear()
    set(YEAR, 2009)
    set MONTH, SEPTEMBER
    set DATE, 4
    add DATE, 2
}
assert'September 6, 2009' == cal.time.format('MMMM d, yyyy')