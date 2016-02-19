def tree
tree = { -> return [:].withDefault{ tree() } }

memberInfo = tree()
memberInfo.memberDetails.firstName = 'hrldcpr'
memberInfo.memberDetails.lastName = 'tim'