def url2 = ['http', 'www.mrhaki.com', 80, '/'] as URL

assert 'http' == url2.protocol
assert 'www.mrhaki.com' == url2.host
assert 80 == url2.port
assert '/' == url2.file
assert '/' == url2.path