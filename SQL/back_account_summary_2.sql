select u.name, sum(t.amount) balance from
Users u inner join Transactions t
on u.account = t.account
group by u.name, u.account
having balance > 100
order by u.account;