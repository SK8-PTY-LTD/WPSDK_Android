# Motivation

WordPress had been one of the most popular open-source CRM in the world. Wouldn't it be great if it can be used as a backend for your app? On top of WordPress, you have

1. **One** database, for both your website and app
1. **Dashboard** to manage data, no more need to develop a custom a Management Portal
1. **Reduced** time and cose

Since the release of [4.7 Vauhan](https://wordpress.org/news/2016/12/vaughan/) in Dec 2016, WordPress comes with **[REST API endpoints](https://developer.wordpress.org/rest-api/reference/)** for posts, comments, terms, users, meta, and settings.

This means **by default**, any **WordPress** 4.7+ instance can now be used as a **BAAS** for your app.

REST API is already a well-received standard in developer communities, many excellent native lib exists for native apps to consume REST API, such as [Alamofire](https://github.com/Alamofire/Alamofire) & [Retrofit](https://github.com/square/retrofit). 

However the experience of writing raw API calls it is just not elegant enough for our coding taste. And this is exactly what WPSDK is:

WPSDK is a **mobile SDK** which allows **native** apps to use any **WordPress 4.7+** as a **BAAS**. 

# Development

This is an alpha version of the SDK, and is **NOT** recommended to be used in production.

1. [Milestones](doc/milestones.md)
1. [Progress](doc/progress.md)
1. [Documentation](docs/README.md)

A more comprehensive REST API documentation can be found at [WordPress.org Handbook](https://developer.wordpress.org/rest-api/)

# Open Source

## Contributing

Pull requests for new features, bug fixes, and suggestions are welcome!

## Author
[Jack Song](https://github.com/jacktator)

# Legal

## Copyright

Copyright © 2013-2017 SK8 PTY LTD
app@sk8.asia

## License

The MIT License (MIT) - See [LICENSE](LICENSE) for further details.

