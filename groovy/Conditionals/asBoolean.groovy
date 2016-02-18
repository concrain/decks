String.metaClass.asBoolean = {
    delegate == /sure/
}
assert !'true'
assert 'sure'